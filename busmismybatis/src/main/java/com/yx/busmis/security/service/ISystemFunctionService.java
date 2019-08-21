package com.yx.busmis.security.service;

import java.util.List;

import com.yx.busmis.security.model.SystemFunctionModel;

public interface ISystemFunctionService {
	
	public void register(SystemFunctionModel sfm) throws Exception;
	
	public void delete(SystemFunctionModel sfm) throws Exception;
	
	public List<SystemFunctionModel> getListByMno(int mno) throws Exception;
	
	public List<SystemFunctionModel> getListByAll() throws Exception;
	
	public List<SystemFunctionModel> getListByAllWithModelBySelect() throws Exception;

	public List<SystemFunctionModel> getListByAllWithModelByResultMap() throws Exception;

}
