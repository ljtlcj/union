package com.yx.busmis.security.dao;

import java.util.List;

import com.yx.busmis.security.model.SystemModel;

public interface ISystemModelDao {
	
	public void create(SystemModel sm) throws Exception;
	
	public void update(SystemModel sm) throws Exception;

	public void delete(SystemModel sm) throws Exception;
	
	public SystemModel selectByMno(int mno) throws Exception;
		
	//无关联查询模块列表
	public List<SystemModel> selectListByAll( ) throws Exception;
	
	//关联查询出功能(function)通过select方法
	public List<SystemModel> selectListByAllWithfunctionBySelect( ) throws Exception;
	
	//关联查询出功能(function)通过ResultMap方法
	public List<SystemModel> selectListByAllWithfunctionByResultMap( ) throws Exception;

	
}
