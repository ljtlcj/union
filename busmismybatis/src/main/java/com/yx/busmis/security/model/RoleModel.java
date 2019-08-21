package com.yx.busmis.security.model;

import java.util.List;

import lombok.Data;

@Data
public class RoleModel {
	private int rno;
	private String rname;
	
	private List<UserModel> umlist;
	private List<SystemModel> smlist;
}
