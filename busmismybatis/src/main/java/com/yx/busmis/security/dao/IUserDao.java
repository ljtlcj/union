package com.yx.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yx.busmis.security.model.RoleModel;
import com.yx.busmis.security.model.UserModel;


public interface IUserDao {
	
	public void create(UserModel userModel) throws Exception;
	
	public void update(UserModel userModel) throws Exception;

	public void delete(UserModel userModel) throws Exception;
	
	public List<UserModel> selectListByAll( ) throws Exception;
	
	public UserModel selectById(String id) throws Exception;

	//为用户增加一个角色
	public void addRole(@Param("id")String id,@Param("roleNo")int roleNo)throws Exception;
	//为用户增加多个角色
	public void addRole(@Param("id")String id,@Param("roleNoList")int[] roleNoList)throws Exception;
	//取得指定用户的角色列表
	public List<RoleModel> selectRoleListByUser()throws Exception;
	//取得指定的用户是否有制定的角色，取得用户和角色关联的个数
	public int selectCountByUserAndRoles(@Param("id")String id,@Param("roleNo")int roleNo)throws Exception;
}
