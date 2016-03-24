package com.web.food;

 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;



@SuppressWarnings("serial")
public class FoodEditServlet extends HttpServlet {

	
	
	   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	    String flag = req.getParameter("f");
	    
		FoodMgrDao foodMgrDao = new FoodMgrDao();
        String fileName = null;
   
		
		if(ServletFileUpload.isMultipartContent(req)) {

			   Food food = new Food();
			   
			   DiskFileItemFactory factory = new DiskFileItemFactory();   
			   String dir_path =  req.getRealPath("/") ;

			   factory.setRepository(new File( dir_path + "/tmp"));  
			   //内存最大占用   
	           factory.setSizeThreshold(1024000);   
	           ServletFileUpload sfu = new ServletFileUpload(factory);   
	           sfu.setHeaderEncoding("utf-8");
	           
	           //单个文件最大值byte   
	           sfu.setFileSizeMax(102400000);   
	           //所有上传文件的总和最大值byte   
	           sfu.setSizeMax(204800000);   
	           List items = null;   
	           try {   
	               items = sfu.parseRequest(req);   
	           } catch (SizeLimitExceededException e) {   
	               System.out.println("size limit exception!");   
	           } catch(Exception e) {   
	               e.printStackTrace();   
	           }   
	           
	           Iterator iter = items==null?null:items.iterator();   
	           while(iter != null && iter.hasNext()) {   
	               FileItem item = (FileItem)iter.next();   
	               //简单的表单域   
	               if(item.isFormField()) {   
	                   String   str =   iso2gb ( item.getString() ) ;
	                   System.out.print("form field:");   
	                   System.out.print(item.getFieldName() + "  ");   
	                   System.out.print( str );   

	                   if( item.getFieldName().equals("foodName") ){
	                	   food.setFood_name( str ) ;
	                   }else if( item.getFieldName().equals("description")   ){ 
	                	   food.setFood_description( str  );
	                   }else if( item.getFieldName().equals("price")   ){ 
	                	   food.setFood_price(  str  );
	                   }else if( item.getFieldName().equals("discountPrice")   ){ 
	                	   food.setFood_discount_price(  str  );
	                   }else if( item.getFieldName().equals("flag")   ){ 
	                	   food.setFood_flag(  str  );
	                   }
	                   
	               }    
	               //文件域   
	               else if(!item.isFormField()) {    
                        System.out.println("上传文件的名称:" + item.getName());
	                   	if(item.getName().lastIndexOf("/") != -1){
	                   		fileName = item.getName().substring(item.getName().lastIndexOf("/")+1,item.getName().length());
	                   	}else if(item.getName().lastIndexOf("\\") != -1){
	                   		fileName = item.getName().substring(item.getName().lastIndexOf("\\")+1,item.getName().length());
	                   	}else{
	                   		fileName = item.getName();
	                   	}
	                   BufferedInputStream in = new BufferedInputStream(item.getInputStream());   
	                   //文件存储在工程的upload目录下,这个目录也得存在   
	                   BufferedOutputStream out = new BufferedOutputStream(   
	                            new FileOutputStream(new File( dir_path + "/upload/" + fileName)));   
	                   Streams.copy(in, out, true);   
	               }   
	           }   
	           food.setFood_pic( fileName );
	           foodMgrDao.save(food);
	           req.setAttribute("s", "0") ;	   
	           req.getRequestDispatcher("/foodsEdit.jsp").forward(req, resp);
		}
		
	}



	/**
	 * 
	 *  表单提交乱码解决
	 * @param str
	 * @return
	 */	
	private String iso2gb(String str){
	 
		try {
			return  new  String( str.getBytes("iso-8859-1"),"utf-8" );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
  
	
}
