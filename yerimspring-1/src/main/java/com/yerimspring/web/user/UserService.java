package com.yerimspring.web.user;

import java.util.List;

public interface UserService {

	public void signIn(User user);

	public List<User> findAll();

	public User findOne(String userid);

	public void modify(User user);

	public void remove(User user);

	
}
