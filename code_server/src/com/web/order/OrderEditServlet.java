package com.web.order;

 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.food.Food;

import net.sf.json.JSONArray;



@SuppressWarnings("serial")
public class OrderEditServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
 
		OrderDao orderDao = new OrderDao();
 
	 	if ( req.getParameter("method") != null &&  req.getParameter("method").equals("save")  ){
	 			
	 			Order order = new Order(); 

	 			order.setFood_id(  req.getParameter("order.food_id") ) ;
	 			order.setSeat( req.getParameter("order.seat")  ); 
	 			order.setDesc( req.getParameter("order.food_name") ) ;
	 			order.beizhu =  req.getParameter("order.beizhu") ;
	 			order.price =  req.getParameter("order.price") ;
	 			
	 			orderDao.save(order);
	 			
	 			String food_ids = req.getParameter("food_ids") ;
	 			String[] food_id = food_ids.split("_") ;
	 			
	 			for(int i=0; i<food_id.length ; i++){
	 				if( food_id[i] !=null && !"".equals(food_id[i]) ){
		 				Food food = orderDao.getFoodById( food_id[i] );
		 				long food_count = Long.valueOf(food.food_count);
		 				food_count = food_count+1 ;
		 				orderDao.updateFoodCount(  food_id[i]   , food_count ) ;
	 				}
	 			}
	 			 
	 			resp.setCharacterEncoding("utf-8");
				
		    	try {
		    		resp.getWriter().write( "1");
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
	 	}

	}
 
  
	
}
