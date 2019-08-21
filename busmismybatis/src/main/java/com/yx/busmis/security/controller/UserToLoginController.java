package com.yx.busmis.security.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.UserModel;
import com.yx.busmis.security.service.IUserService;

/**
 * Servlet implementation class UserToLoginController
 */
@WebServlet("/tologin.do")
public class UserToLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService us=ServiceFactory.createUserService();
		UserModel um=new UserModel();
		um.setUsername((String)request.getParameter("username"));
		um.setUserpassword((String)request.getParameter("userpassword"));	
		um.setUserid((String)request.getParameter("userid"));	
		
		
		
		
		try {
			System.out.print("try find....");
			if(us.validate(um)) {
				System.out.print("validate success....");
				
				//验证成功，存入完整的UserModel到session
				
				request.getSession().setAttribute("user", us.getById((String)request.getParameter("userid")));
				
				response.sendRedirect("user/Userlist.jsp");
			}else {
				System.out.print("validate fail....");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}						
		} catch (Exception e) {
			System.out.print("try find fail...");
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
