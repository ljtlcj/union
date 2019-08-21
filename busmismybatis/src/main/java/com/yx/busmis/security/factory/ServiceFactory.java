package com.yx.busmis.security.factory;

import com.yx.busmis.security.service.IRoleService;
import com.yx.busmis.security.service.ISystemFunctionService;
import com.yx.busmis.security.service.ISystemModelService;
import com.yx.busmis.security.service.IUserService;
import com.yx.busmis.security.service.impl.RoleServiceImpl;
import com.yx.busmis.security.service.impl.SystemFunctionServiceImpl;
import com.yx.busmis.security.service.impl.SystemModelServiceImpl;
import com.yx.busmis.security.service.impl.UserServiceImpl;

public class ServiceFactory {
	public static IUserService createUserService(){
		return new UserServiceImpl();
	}
	public static ISystemModelService createSystemModelService(){
		return new SystemModelServiceImpl();
	}
	public static ISystemFunctionService createSystemFunctionService(){
		return new SystemFunctionServiceImpl();
	}
	public static IRoleService createRoleService(){
		return new RoleServiceImpl();
	}
}
