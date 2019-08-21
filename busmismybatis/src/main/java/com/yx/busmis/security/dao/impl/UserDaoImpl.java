package com.yx.busmis.security.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yx.busmis.factory.ConnectionFactoryWithC3p0;
import com.yx.busmis.factory.ConnectionFactoryWithDBCP;
import com.yx.busmis.factory.ConnectionFactoryWithJNDI;
import com.yx.busmis.security.dao.IUserDao;
import com.yx.busmis.security.model.RoleModel;
import com.yx.busmis.security.model.UserModel;

public class UserDaoImpl implements IUserDao {

	@Override
	public void create(UserModel userModel) throws Exception {
		try {
			/*
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://10.1.55.128:3318/busmis","busmis","busmis");			
			*/
			System.out.println("开始连接............");
			
			//Connection cn = ConnectionFactoryWithDBCP.getConnection();
			Connection cn = ConnectionFactoryWithC3p0.getConnection();
			//Connection cn = ConnectionFactoryWithJNDI.getConnection();
			System.out.println("连接成功............");

			String sql = "insert into userinfo(USERID,UserPASSWORD,UserNAME,UserROLE) values (?,?,?,?)";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, userModel.getUserid());
			ps.setString(2, userModel.getUserpassword());
			ps.setString(3, userModel.getUsername());
			ps.setString(4, userModel.getUserrole());
			ps.executeUpdate();
			ps.close();
			cn.close();
		} catch (Exception e) {
			System.out.println("连接失败............");
			e.printStackTrace();
		}
	}

	@Override
	public void update(UserModel userModel) throws Exception {
		try {
			System.out.println("开始更新............");
			Connection cn = ConnectionFactoryWithC3p0.getConnection();
			String id=userModel.getUserid();
			System.out.println("根据id="+id+"进行更改");
			System.out.println("密码修改为="+userModel.getUserpassword());

			String sql = "update userinfo set userpassword=?,username=?,userrole=? where userid=?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, userModel.getUserpassword());
			ps.setString(2, userModel.getUsername());
			ps.setString(3, userModel.getUserrole());
			ps.setString(4, userModel.getUserid());
			ps.executeUpdate();
			ps.close();
			cn.close();
		}catch(Exception e) {
			System.out.println("连接失败............");
			e.printStackTrace();
		}	
	}

	@Override
	public void delete(UserModel userModel) throws Exception {
		try {
			Connection cn = ConnectionFactoryWithC3p0.getConnection();
			String sql = "delete from userinfo where username = ? and userpassword= ?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, userModel.getUsername());
			ps.setString(2, userModel.getUserpassword());
			ps.executeUpdate();
			ps.close();
			cn.close();
		}catch(Exception e) {
			System.out.println("连接失败............");
			e.printStackTrace();
		}	
	}

	@Override
	public List<UserModel> selectListByAll() throws Exception {
		
		List<UserModel> list=new ArrayList<UserModel>();
		
		try {
			Connection cn = ConnectionFactoryWithC3p0.getConnection();
			String sql = "select * from userinfo";
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {		
				//System.out.println(rs.getString("userpassword"));
				UserModel um = new UserModel();
				um.setUserid(rs.getString("userid"));
				um.setUserpassword(rs.getString("userpassword"));
				um.setUsername(rs.getString("username"));
				um.setUserrole(rs.getString("userrole"));
				list.add(um);
				//System.out.println(um.getUsername());
			}
			ps.close();
			cn.close();
		}catch(Exception e) {
			System.out.println("连接失败............");
			e.printStackTrace();
		}	
		return list;
	}

	@Override
	public UserModel selectById(String id) throws Exception {
		
		UserModel um = new UserModel();
		
		try {
			Connection cn = ConnectionFactoryWithC3p0.getConnection();
			String sql = "select * from userinfo where userid=?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {		
				//System.out.println(rs.getString("userpassword"));
				um.setUserid(rs.getString("userid"));
				um.setUserpassword(rs.getString("userpassword"));
				um.setUsername(rs.getString("username"));
				um.setUserrole(rs.getString("userrole"));
				//System.out.println(um.getUserpassword());
			}
			ps.close();
			cn.close();
		}catch(Exception e) {
			System.out.println("连接失败............");
			e.printStackTrace();
		}	
		return um;
	}

	@Override
	public void addRole(String id, int roleNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRole(String id, int[] roleNoList) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleModel> selectRoleListByUser() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCountByUserAndRoles(String id, int roleNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
