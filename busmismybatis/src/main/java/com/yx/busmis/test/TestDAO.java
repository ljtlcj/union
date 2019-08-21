package com.yx.busmis.test;

import java.util.ArrayList;
import java.util.List;

import com.yx.busmis.security.dao.IUserDao;

import com.yx.busmis.security.factory.ServiceFactory;
import com.yx.busmis.security.model.UserModel;
import com.yx.busmis.security.service.IUserService;

public class TestDAO {

	public static void main(String args[]) {
		
		//数据模型
		UserModel usermodel = new UserModel();		
		usermodel.setUserid("123321");
		//usermodel.setUsername("666666");
		//usermodel.setUserpassword("666666");
		//usermodel.setUserrole("666666");
		
		
		//IUserDao ud = DaoFactory.createrUserDao();
		
		
		IUserService us= ServiceFactory.createUserService();
		
		List<UserModel> list=new ArrayList<UserModel>();
		
		try {
			//us.register(usermodel);
			//us.modify(usermodel);
			//us.changePassword("123321", "55555");
			//UserModel usermodel1 = ud.selectById("123321");
			//System.out.print(usermodel1.getUserpassword());
			//ud.delete(usermodel);
			//list=ud.selectListByAll();
			//System.out.println(list.get(0).getUserid());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			//ud.create(usermodel);
			System.out.println("插入成功............");
		} catch (Exception e) {
			System.out.println("插入失败............");
			e.printStackTrace();
		}
	}

	
}
