package com.yx.busmis.security.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.SystemFunctionModel;
import com.yx.busmis.security.service.ISystemFunctionService;

/**
 * Servlet implementation class SystemFunctionToSelectSystemFunctionController
 */
@WebServlet("/SystemFunctionToSelectSystemFunctionController")
public class SystemFunctionToSelectSystemFunctionController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ISystemFunctionService sms = ServiceFactory.createSystemFunctionService();
		try {
			/*
			List<SystemFunctionModel> list = sms.getListByMno(9);
			for(SystemFunctionModel sfm:list) {
				System.out.println(sfm);
			}
			*/
			/*
			List<SystemFunctionModel> list = sms.getListByAll();
			for(SystemFunctionModel sfm:list) {
				System.out.println(sfm);
			}
			*/
			
			List<SystemFunctionModel> list = sms.getListByAllWithModelBySelect();
			for(SystemFunctionModel sfm:list) {
				System.out.println(sfm.getFunname()+" 属于模块(通过Select方法):"+sfm.getSm().getMname());
			}
			
			/*
			List<SystemFunctionModel> list = sms.getListByAllWithModelByResultMap();
			for(SystemFunctionModel sfm:list) {
				System.out.println(sfm.getFunname()+" 属于模块(通过ResultMap方法):"+sfm.getSm().getMname());
			}
			*/
		} catch (Exception e) {
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
