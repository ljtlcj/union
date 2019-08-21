package com.yx.busmis.security.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.RoleModel;
import com.yx.busmis.security.model.SystemFunctionModel;
import com.yx.busmis.security.model.SystemModel;
import com.yx.busmis.security.service.IRoleService;
import com.yx.busmis.security.service.ISystemFunctionService;
import com.yx.busmis.security.service.ISystemModelService;

/**
 * Servlet implementation class SystemFunctionToCreateSystemFunctionController
 */
@WebServlet("/SystemFunctionToCreateSystemFunctionController")
public class SystemFunctionToCreateSystemFunctionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ISystemFunctionService sms = ServiceFactory.createSystemFunctionService();
		SystemFunctionModel sfm = new SystemFunctionModel();
		sfm.setFunname("111");
		sfm.setFunurl("111");
		//sfm.setMno(1);
		SystemModel systemModel = new SystemModel();
		systemModel.setMno(1);
		sfm.setSm(systemModel);
		try {
			sms.register(sfm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
