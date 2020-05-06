package com.yerimspring.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yerimspring.web.util.Data;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void insert(User user) {
		try {
			BufferedWriter writer = new BufferedWriter(
									new FileWriter(
									new File(Data.USERS.toString())));
			writer.write(user.toString());
			writer.newLine();
			writer.flush();
		} catch(Exception e) {
			
		} 
	}

	@Override
	public List<User> selectAll() {
		List<User> userList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(
									new FileReader(
									new File(Data.USERS.toString())));
			String messege = "";
			while((messege= reader.readLine())!= null) {
				list.add(messege);
			}
			reader.close();
		}catch (Exception e) {

		}
		User u = null;
		for(int i = 0; i <list.size(); i++) {
			u = new User();
			String[] arr = list.get(i).split(",");
			u.setUserid(arr[0]);
			u.setPassword(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddress(arr[4]);
			u.setProfile(arr[5]);
			u.setEmail(arr[6]);
			u.setPhoneNumber(arr[7]);
			u.setRegiterDate(arr[8]);
			userList.add(u);
		}
		return userList;
	}

	@Override
	public User selectOne(String userid) {
		List<User> list = selectAll();
		User findUser = null;
		for(User u : list) {
			if(userid.equals(u.getUserid())) {
				findUser = u;
				break;
			}
		}
		return findUser;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
