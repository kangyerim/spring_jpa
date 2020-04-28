package com.yerimspring.web.admin;

public interface AdminService {
	public void add(Admin member);

	public Admin[] list();

	public Admin[] searchByName(String name);

	public Admin detail(Admin member);

	public int count();

	public boolean login(Admin member);

	public int count(String name);

	public void update(Admin member);

	public void delete(Admin member);
}
