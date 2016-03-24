package com.web.type;

 
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.displaytag.tags.TableTagParameters;
import org.displaytag.util.ParamEncoder; 
import com.web.util.Constants;

import net.sf.json.JSONArray;



@SuppressWarnings("serial")
public class TypeMgrServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String method = req.getParameter("method");
		TypeMgrDao newsMgrDao = new TypeMgrDao();
 
		if (method.equals("list")) {

			String type = req.getParameter("type");
		    
		    if (type != null && type.equals("json")) {
		    	 
		    	JSONArray jsonArray  =  JSONArray.fromObject( newsMgrDao.getAll(req.getParameter("name")) );
		    	resp.setCharacterEncoding("gb2312");
		    	
		    	try {
		    		resp.getWriter().write(jsonArray.toString());
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
		    	return ;		    	
			}  else {
				getAll(req, newsMgrDao);
				req.getRequestDispatcher("/type_list.jsp").forward(req, resp);
			}
		    
		} else if (   method.equals("goUpdate") ){

			String id = req.getParameter("id");

			req.setAttribute("map", newsMgrDao.getObjectById(id) ); 
			req.getRequestDispatcher("/type_add.jsp").forward(req, resp);
			
		} else if ( method.equals("goAdd") ) { 
			
 			TypeMgrDao typeMgrDao = new TypeMgrDao();
 			
			req.setAttribute( "typeList", typeMgrDao.getAll(null) ) ;
			req.getRequestDispatcher("/foodsEdit.jsp").forward(req, resp);
			return ;
			
		} else if (method.equals("save")) { 
  
			   	Type news  = new Type();
			   	boolean isAdd  = false ;
			   	if( req.getParameter("id") != null && !req.getParameter("id") .equals("") ){
				   	news.setId( Integer.valueOf( req.getParameter("id") )  ) ;
			   	}else {
			   		isAdd = true; 
			   	}
			   	news.setName(  req.getParameter("name") )  ;
			   	news.setContent(  req.getParameter("content")  ) ; 
  
			   	news.state = req.getParameter("state") ;
			   	
			   	newsMgrDao.save( news ) ;
			   	if( isAdd) {
					req.setAttribute("s", "0") ; 
					req.getRequestDispatcher("/type_add.jsp").forward(req, resp);
			   	} else {
			   		getAll(req, newsMgrDao);
					req.getRequestDispatcher("/type_list.jsp").forward(req, resp);
			   	}
			
		} else if (method.equals("del")) {
			String id = req.getParameter("id");
			newsMgrDao.delete(id);
			getAll(req, newsMgrDao);
			req.getRequestDispatcher("/type_list.jsp").forward(req, resp);
		}

	}

	private void getAll(HttpServletRequest req, TypeMgrDao objectDao) { 
		
		int pageNo = 0 ; 
		int start =  0 ;

		String pageName = new ParamEncoder("element").encodeParameterName(TableTagParameters.PARAMETER_PAGE);
		
		if( req.getParameter(pageName) != null  && !req.getParameter(pageName).equals("")){
			pageNo = Integer.parseInt( req.getParameter(pageName) );
		}else{
			pageNo = 1 ;
		}

		start = (pageNo-1) * Constants.PAGE_SIZE  ;
 
		List list = objectDao.getAll( start , Constants.PAGE_SIZE , null ); 
 
		req.setAttribute("total",  objectDao.getTotalCount() );
		req.setAttribute("list", list);  
	}

//	private void getAll(HttpServletRequest req, TypeMgrDao newsMgrDao) {
//
//		List list = newsMgrDao.getAll( null );
//
//		req.setAttribute("list", list); 
//	}
  
	
}
