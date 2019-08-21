package com.yx.busmis.security.factory;

import com.yx.busmis.security.dao.IUserDao;
import com.yx.busmis.security.dao.impl.UserDaoImpl;

public class DaoFactory {

	
	public static IUserDao createrUserDao() {
		return new UserDaoImpl();
	};
}
