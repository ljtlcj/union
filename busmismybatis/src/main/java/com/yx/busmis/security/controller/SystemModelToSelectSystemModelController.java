package com.yx.busmis.security.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.SystemModel;
import com.yx.busmis.security.service.ISystemModelService;

/**
 * Servlet implementation class SystemModelToSelectSystemModelController
 */
@WebServlet("/SystemModelToSelectSystemModelController")
public class SystemModelToSelectSystemModelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ISystemModelService sms = ServiceFactory.createSystemModelService();
		try {
			/*
			List<SystemModel> list = sms.getListByAllWithFunctionBySelect();
			for(SystemModel sm:list) {
				System.out.println(sm.getMname()+"----功能个数为(通过Select查找)："+sm.getSfmList().size());		
			}
			*/
			/*
			List<SystemModel> list = sms.getListByAllWithFunctionByResultMap();
			for(SystemModel sm:list) {
				System.out.println(sm.getMname()+"----功能个数为(通过ResultMap查找)："+sm.getSfmList().size());		
			}
			*/
			SystemModel sm = sms.getByMno(9);
			System.out.println(sm);
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
