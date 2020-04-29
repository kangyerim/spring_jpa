package com.yerimspring.web.user;

import java.io.BufferedReader;
import com.yerimspring.web.util.Data;
import com.yerimspring.web.util.Messenger;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeriveImpl implements UserService {
	@Autowired UserDao userDao;

	@Override
	public void signIn(User user) {
		userDao.insert(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.selectAll();
	}

	@Override
	public User findOne(String userid) {
		return userDao.selectOne(userid);
	}

	@Override
	public void modify(User user) {
		userDao.update(user);
	}

	@Override
	public void remove(User user) {
		userDao.delete(user);
	}


}
