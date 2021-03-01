package com.dao;

import java.util.ArrayList;

import com.bean.AUserBean;

public class AUserDao {
	static private ArrayList<AUserBean> userList = new ArrayList<AUserBean>();
	static int totalUser = 0;
	public  void insertUser(AUserBean user) {
		
		user.setUserId(++totalUser);
		userList.add(user);
	}


	public ArrayList<AUserBean> getAllUsers(){
		return userList;
	}


	public void deleteUser(int userId) {

			for(int i=0;i<userList.size();i++) {
				if(userList.get(i).getUserId() == userId) {
					userList.remove(i);
					break;
				}
			}
		
	}


	public AUserBean getDataByUserId(int userId) {
		for(AUserBean user:userList) {
			if(user.getUserId() == userId) {
				return user;
			}
		}
		
		return null;
	}


	public void updateUser(AUserBean user) {
		//a b c d e f 
		for(int i=0;i<userList.size();i++) {
				if(userList.get(i).getUserId() == user.getUserId()) {
					userList.get(i).setFirstName(user.getFirstName());
					userList.get(i).setEmail(user.getEmail());
				}
		}

	}
}
