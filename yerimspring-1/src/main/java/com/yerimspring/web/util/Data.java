package com.yerimspring.web.util;

import java.io.File;

public enum Data {
	CSV, LIST, USER_PATH, ADMIN_PATH;

	@Override
	public String toString() {
		String retrunValue = "";
		switch (this) {
		case USER_PATH:
			retrunValue = "C:" + File.separator + "Users" + File.separator + "bit" + File.separator + "git"
					+ File.separator + "repository2" + File.separator + "yerimspring-1" + File.separator + "src"
					+ File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator
					+ "yerimspring" + File.separator + "web" + File.separator + "user" + File.separator;
			break;

		case ADMIN_PATH:
			retrunValue = "C:" + File.separator + "Users" + File.separator + "bit" + File.separator + "git"
					+ File.separator + "repository2" + File.separator + "yerimspring-1" + File.separator + "src"
					+ File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator
					+ "yerimspring" + File.separator + "web" + File.separator + "admin" + File.separator;
			break;

		case CSV:
			retrunValue = ".csv";
			break;
		}
		return retrunValue;
	}
}
