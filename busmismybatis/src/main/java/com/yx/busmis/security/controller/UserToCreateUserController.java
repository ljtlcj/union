package com.yx.busmis.security.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.UserModel;
import com.yx.busmis.security.service.IUserService;
import com.yx.busmis.security.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserToCreateUserController
 */
@WebServlet("/user/tocreateUser.do")
public class UserToCreateUserController extends HttpServlet {
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
		um.setUserrole((String)request.getParameter("userrole"));
	
		try {			
			us.register(um);			
			request.getRequestDispatcher("createUser.jsp").forward(request, response);
		} catch (Exception e) {			
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
