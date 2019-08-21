package com.yx.busmis.security.service;

import java.util.List;

import com.yx.busmis.security.model.UserModel;


public interface IUserService {
	
	public void register(UserModel userModel) throws Exception;
	
	public void modify(UserModel userModel) throws Exception;

	public void changePassword(String id,String password) throws Exception;
	
	public void changeRole(String id,String role) throws Exception;
	
	public boolean validate(UserModel userModel) throws Exception;

	public List<UserModel> getListByAll( ) throws Exception;
	
	public UserModel getById(String id) throws Exception;
	
	public void active(String id) throws Exception;
	
	public void disable(String id) throws Exception;
	
	public void delete(UserModel userModel)throws Exception;
}
