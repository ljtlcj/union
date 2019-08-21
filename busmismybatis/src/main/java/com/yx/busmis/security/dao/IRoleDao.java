package com.yx.busmis.security.dao;

import com.yx.busmis.security.model.RoleModel;

public interface IRoleDao {
	
	public void create(RoleModel rm) throws Exception;

	public void delete(RoleModel rm) throws Exception;
}
