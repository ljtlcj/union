package com.yx.busmis.security.dao;

import java.util.List;

import com.yx.busmis.security.model.SystemFunctionModel;

public interface ISystemFunctionDao {
	
	public void create(SystemFunctionModel sfm) throws Exception;
	
	public void update(SystemFunctionModel sfm) throws Exception;

	public void delete(SystemFunctionModel sfm) throws Exception;
	
	public List<SystemFunctionModel> selectListByAll( ) throws Exception;
	
	public List<SystemFunctionModel> selectListByAllWithModelBySelect( ) throws Exception;
	
	public List<SystemFunctionModel> selectListByAllWithModelByResultMap( ) throws Exception;
	
	public SystemFunctionModel selectByFunno(int funno) throws Exception;
	
	//根据系统模块的MNO查找到功能列表
	public List<SystemFunctionModel> selectListByMno(int mno) throws Exception;
	
	
}
