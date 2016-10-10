package com.lynda.javatraining.db;

import java.sql.SQLException;
import com.lynda.javatraining.db.tables.AdminManager;

public class Main {		
	private static final String SQL = "{call GetToursWithCountByPrice(?,?)}";
	public static void main(String args[]) throws SQLException {
		AdminManager.displayAllRows();
	}
}
