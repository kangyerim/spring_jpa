package com.yerimspring.web.admin;

import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	private Admin[] members;
	private int count;

	public AdminServiceImpl() {
		members = new Admin[5];
		count = 0;
	}

	@Override
	public void add(Admin member) {
		members[count] = member;
		count++;
	}

	@Override
	public Admin[] list() {
		return members;
	}

	@Override
	public Admin[] searchByName(String name) {
		Admin[] searchByName = null;
		int searchCount = count(name);
		if(searchCount != 0) {
			searchByName = new Admin[searchCount];
			int j = 0;
			for(int i = 0; i < count; i++) {
				if(name.equals(members[i].getName())) {
					searchByName[j]=members[i];
					j++;
				}
				if(searchCount == j){
					break;
				}
			}
			
		}
		return searchByName;
	}

	@Override
	public Admin detail(Admin member) {
		Admin detail = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				detail = members[i];
			}
		}
		return detail;
	}

	@Override
	public boolean login(Admin member) {
		boolean ok = false;
		for(int i = 0; i < count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int count(String name) {
		int count = 0;
		for (int i = 0; i < this.count; i++) {
			if (name.equals(members[i].getName())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void update(Admin member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPassword(member.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(Admin member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;
			}
		}
	}

}
