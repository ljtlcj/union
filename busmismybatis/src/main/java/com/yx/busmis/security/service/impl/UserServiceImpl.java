package com.yx.busmis.security.service.impl;

import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yx.busmis.factory.MyBatisFactory;
import com.yx.busmis.security.dao.IUserDao;
import com.yx.busmis.security.factory.DaoFactory;
import com.yx.busmis.security.model.UserModel;
import com.yx.busmis.security.service.IUserService;

public class UserServiceImpl implements IUserService{

	private IUserDao userDao = DaoFactory.createrUserDao();
	
	@Override
	public void register(UserModel userModel) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		userDao.create(userModel);
		session.commit();
		session.close();
	}

	@Override
	public void modify(UserModel userModel) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		userDao.update(userModel);
		session.commit();
		session.close();
	}

	@Override
	public void changePassword(String id, String password) throws Exception {
		
	}

	@Override
	public void changeRole(String id, String role) throws Exception {
		
	}

	@Override
	public boolean validate(UserModel userModel) throws Exception {
		UserModel um = userDao.selectById(userModel.getUserid());
		System.out.println(userModel.getUserid());
		System.out.println(um.getUserpassword());
		System.out.println(userModel.getUserpassword());

		if(userModel.getUserpassword().equals(um.getUserpassword())) {
			return true;
		}
		return false;
	}

	@Override
	public List<UserModel> getListByAll() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<UserModel> list=userDao.selectListByAll();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public UserModel getById(String id) throws Exception {		
		return userDao.selectById(id);
	}

	@Override
	public void active(String id) throws Exception {
		
	}

	@Override
	public void disable(String id) throws Exception {
		
	}

	@Override
	public void delete(UserModel userModel) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		userDao.delete(userModel);
		session.commit();
		session.close();
	}

}
