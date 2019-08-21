package com.yx.busmis.security.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.RoleModel;
import com.yx.busmis.security.service.IRoleService;

/**
 * Servlet implementation class RoleToCreateController
 */
@WebServlet("/RoleToCreateController")
public class RoleToCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		IRoleService rs = ServiceFactory.createRoleService();
		RoleModel rm = new RoleModel();
		rm.setRname("112");
		try {
			rs.register(rm);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
