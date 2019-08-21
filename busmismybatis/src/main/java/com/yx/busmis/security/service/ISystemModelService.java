package com.yx.busmis.security.service;

import java.util.List;

import com.yx.busmis.security.model.SystemModel;

public interface ISystemModelService {
	
	public void register(SystemModel sm) throws Exception;
	
	public void delete(SystemModel sm) throws Exception;
	
	public List<SystemModel> getListByAll() throws Exception;
	
	public List<SystemModel> getListByAllWithFunctionBySelect() throws Exception;
	
	public List<SystemModel> getListByAllWithFunctionByResultMap() throws Exception;

	public SystemModel getByMno(int mno) throws Exception;
}
