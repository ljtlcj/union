package com.yx.busmis.security.service.impl;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yx.busmis.factory.MyBatisFactory;
import com.yx.busmis.security.dao.IRoleDao;
import com.yx.busmis.security.dao.ISystemFunctionDao;
import com.yx.busmis.security.model.RoleModel;
import com.yx.busmis.security.service.IRoleService;

public class RoleServiceImpl implements IRoleService {

	@Override
	public void register(RoleModel rm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IRoleDao iRoleDao = session.getMapper(IRoleDao.class);
		iRoleDao.create(rm);
		session.commit();
		session.close();
	}

	@Override
	public void delete(RoleModel rm) throws Exception {
		SqlSession session = MyBatisFactory.getSession();
		IRoleDao iRoleDao = session.getMapper(IRoleDao.class);
		iRoleDao.delete(rm);
		session.commit();
		session.close();
	}
}
