package com.web;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.user.User;
import com.web.user.UserDao;
 


public class LoginServlet extends HttpServlet {
 
 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name  = req.getParameter("name");
		String password  = req.getParameter("password"); 
		String type  = req.getParameter("type");

		UserDao userDao = new UserDao(); 
		User user = null ;
		
		if(type.equals("0")){
//			普通
//			if( userDao.login("user", name,  password ) ){
//				user = userDao.getUserByName("user", name, password ) ;
//				req.getSession().setAttribute("sid", user.getId() ) ;
//				req.getSession().setAttribute("screen_name", user.getScreen_name() ) ;
//				req.getRequestDispatcher("/index.jsp").forward(req, resp);
//				return ;
//			}
		
		}else{
//			管理员
			if( userDao.login("admin", name,  password ) ){
				user = userDao.getUserByName("admin", name, password ) ;
				req.getSession().setAttribute("admin", user.getId() ) ;
				req.getSession().setAttribute("screen_name", user.getScreen_name() ) ;
				req.getSession().setAttribute("sid", user.getId() ) ;
				req.getSession().setAttribute("type", user.type ) ;
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
				return ;
			}
		}
		 
		req.setAttribute("s", "0");
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	

 

}
