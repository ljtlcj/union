package com.yx.busmis.security.service;

import com.yx.busmis.security.model.RoleModel;

public interface IRoleService {
	
	public void register(RoleModel rm) throws Exception;
	
	public void delete(RoleModel rm) throws Exception;
}
