package com.yx.busmis.security.service.impl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yx.busmis.factory.MyBatisFactory;
import com.yx.busmis.security.dao.ISystemFunctionDao;
import com.yx.busmis.security.model.SystemFunctionModel;
import com.yx.busmis.security.service.ISystemFunctionService;

public class SystemFunctionServiceImpl implements ISystemFunctionService {

	@Override
	public void register(SystemFunctionModel sfm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		iSystemFunctionDao.create(sfm);
		session.commit();
		session.close();
	}

	@Override
	public void delete(SystemFunctionModel sfm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		iSystemFunctionDao.delete(sfm);
		session.commit();
		session.close();
	}

	@Override
	public List<SystemFunctionModel> getListByMno(int mno) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		List<SystemFunctionModel> list=iSystemFunctionDao.selectListByMno(mno);
		session.commit();
		session.close();
		return list;
	}

	@Override
	public List<SystemFunctionModel> getListByAll() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		List<SystemFunctionModel> list=iSystemFunctionDao.selectListByAll();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public List<SystemFunctionModel> getListByAllWithModelBySelect() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		List<SystemFunctionModel> list=iSystemFunctionDao.selectListByAllWithModelBySelect();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public List<SystemFunctionModel> getListByAllWithModelByResultMap() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemFunctionDao iSystemFunctionDao = session.getMapper(ISystemFunctionDao.class);
		List<SystemFunctionModel> list=iSystemFunctionDao.selectListByAllWithModelByResultMap();
		session.commit();
		session.close();
		return list;
	}

}
