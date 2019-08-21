package com.yx.busmis.security.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class UserModel implements Serializable {
	private String userid=null;
	private String userpassword=null;
	private String username=null;
	private String userrole=null;
	private String status=null;
	
	private List<RoleModel> rmlist;
	
}
