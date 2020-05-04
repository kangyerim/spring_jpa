package com.yerimspring.web.util;

import java.io.File;

public enum Data {
	CSV, USER_LIST, ADMIN_LIST, USER_PATH, ADMIN_PATH;

	@Override
	public String toString() {
		String retrunValue = "";
		switch (this) {
		case USER_PATH:
			retrunValue = "C:"+ File.separator + "Users" + File.separator + "bit" + File.separator + "git"
				+ File.separator + "repository2" + File.separator + "yerimspring-1" + File.separator + "src"
				+ File.separator + "main" + File.separator + "resources" + File.separator + "static" + File.separator
				+ "resources" + File.separator + "file" + File.separator;
			break;

		case ADMIN_PATH:
			retrunValue = "C:" + File.separator + "Users" + File.separator + "bit" + File.separator + "git"
					+ File.separator + "repository2" + File.separator + "yerimspring-1" + File.separator + "src"
					+ File.separator + "main" + File.separator + "resources" + File.separator + "static" + File.separator
					+ "resources" + File.separator + "file"+ File.separator;
			break;

		case CSV:
			retrunValue = ".csv";
			break;
		case USER_LIST:
			retrunValue = "user_list";
			break;
			
		case ADMIN_LIST :
			retrunValue = "admin_list";
			break;
		}
		
		return retrunValue;
	}
}
