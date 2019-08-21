package com.yx.busmis.security.model;

import java.util.List;

import lombok.Data;

//系统模块
@Data
public class SystemModel {
	private int mno;
	private String mname;
	
	private List<SystemFunctionModel> sfmList;
	private List<RoleModel> rmlist;
	
	public SystemModel() {
		super();
	}
}
