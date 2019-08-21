package com.yx.busmis.security.model;

import lombok.Data;

@Data
public class SystemFunctionModel {
	private int funno;
	private int mno;
	private String funname;
	private String funurl;
	
	private SystemModel sm=null;
}
