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

/**
 * Servlet implementation class UserToModifyController
 */
@WebServlet("/user/tomodifyUser.do")
public class UserToModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService us=ServiceFactory.createUserService();
		UserModel um = new UserModel();
		try {
			um.setUsername(request.getParameter("username"));
			um.setUserpassword(request.getParameter("userpassword"));
			um.setUserrole(request.getParameter("userrole"));	
			um.setUserid(request.getParameter("userid"));
			
			System.out.println("role="+request.getParameter("userrole"));
			System.out.println("username="+request.getParameter("username"));
			System.out.println("userpassword="+request.getParameter("userpassword"));
			System.out.println("userid="+request.getParameter("userid"));

			request.setAttribute("user", um);
			us.modify(um);
			request.getRequestDispatcher("modifyUser.jsp").forward(request, response);
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
