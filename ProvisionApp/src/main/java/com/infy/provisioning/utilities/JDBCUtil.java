package com.infy.provisioning.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	public static String SCHEMA;
	private static Connection jdbcConnection = null;

	public static Connection getConnection() {

		if (null == jdbcConnection) {
			Properties prop = PropertyUtil.getProperties();
			SCHEMA = prop.getProperty("SCHEMA");
			try {
				Class.forName(prop.getProperty("spring.datasource.driver-class-name"));
			} catch (ClassNotFoundException e) {
			}
			try {
				jdbcConnection = DriverManager.getConnection(prop.getProperty("spring.datasource.url"), prop.getProperty("USER"),
						prop.getProperty("spring.datasource.password"));
				jdbcConnection.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return jdbcConnection;
	}

	public static void closeConnection() {
		if (jdbcConnection != null) {
			try {
				jdbcConnection.close();
				jdbcConnection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void commit() {
		try {
			jdbcConnection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * The commit
	 * 
	 */
	public static void rollback() {
		try {
			jdbcConnection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
