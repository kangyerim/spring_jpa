package com.yerimspring.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserSeriveImpl implements UserService {
	public final static String FILE_PATH = "C:\\Users\\bit\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\yerimspring\\src\\main\\resources\\static\\user\\";

	@Override
	public void add(User user) {
		try {
			File file = new File(FILE_PATH + "list.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
					String messege = user.toString();
					writer.write(messege);
					writer.newLine();
					writer.flush(); //보내기
			
		} catch(Exception e) {
			System.out.println("파일 쓰기에서 에러발생");
		}
		
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public User signin(User user) {
		return user;
	}

	@Override
	public User detail(String userid) {
		return null;
	}

	@Override
	public boolean update(User user) {
		return false;
	}

	@Override
	public boolean remove(String userid) {
		return false;
	}

	@Override
	public List<User> list() {
		List<User> userList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(FILE_PATH + "list.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String messege = "";
					while((messege = reader.readLine()) != null) {
						list.add(messege);
					}
					reader.close(); //닫기
		} catch(Exception e) {
			System.out.println("파일 읽기에서 에러 발생");
		}
		User u = null;
		for(int i = 0; i < list.size(); i++) {
			u = new User();
			String[] arr = list.get(i).split(",");
			u.setUserid(arr[0]);
			u.setPassword(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddress(arr[4]);
			userList.add(u);
		}
		return userList;
	}


	@Override
	public boolean idCheck(String userid) {
		boolean idCheck = true;
		List<User> check = list();
		for(int i = 0; i < check.size(); i++) {
			if(userid.equals(check.get(i).getUserid())) {
				idCheck = false;
				break;
			}
		}
		
		return idCheck;
	}

}
