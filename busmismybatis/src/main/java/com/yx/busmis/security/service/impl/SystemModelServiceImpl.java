package com.yx.busmis.security.service.impl;

import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yx.busmis.factory.MyBatisFactory;
import com.yx.busmis.security.dao.ISystemModelDao;
import com.yx.busmis.security.model.SystemModel;
import com.yx.busmis.security.service.ISystemModelService;

public class SystemModelServiceImpl implements ISystemModelService {

	@Override
	public void register(SystemModel sm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		iSystemModelDao.create(sm);
		session.commit();
		session.close();
	}

	@Override
	public void delete(SystemModel sm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		iSystemModelDao.delete(sm);
		session.commit();
		session.close();
	}

	@Override
	public List<SystemModel> getListByAll() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		List<SystemModel> list = iSystemModelDao.selectListByAll();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public List<SystemModel> getListByAllWithFunctionBySelect() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		List<SystemModel> list = iSystemModelDao.selectListByAllWithfunctionBySelect();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public List<SystemModel> getListByAllWithFunctionByResultMap() throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		List<SystemModel> list = iSystemModelDao.selectListByAllWithfunctionByResultMap();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public SystemModel getByMno(int mno) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		ISystemModelDao iSystemModelDao = session.getMapper(ISystemModelDao.class);
		SystemModel sm = iSystemModelDao.selectByMno(mno);
		return sm;
	}

}
