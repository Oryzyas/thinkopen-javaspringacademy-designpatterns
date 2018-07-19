package com.thinkopen.patterns.structural.facade;

import java.sql.Connection;
import java.sql.SQLException;

public class HelperFacade {

	public static void generateReport(DatabaseType dbType, ReportType reportType, String table) throws SQLException {
		Connection con = null;

		switch (dbType) {
			case MYSQL:
				con = MySQLHelper.getMySQLDBConnection();
				MySQLHelper mySQLHelper = new MySQLHelper();

				switch (reportType) {
					case HTML:
						mySQLHelper.generateMySQLHTMLReport(table, con);
						break;
					case PDF:
						mySQLHelper.generateMySQLPDFReport(table, con);
						break;
				}

				con.close();
				break;
			case ORACLE:
				con = OracleHelper.getOracleDBConnection();
				OracleHelper oracleHelper = new OracleHelper();

				switch (reportType) {
					case HTML:
						oracleHelper.generateOracleHTLMReport(table, con);
						break;
					case PDF:
						oracleHelper.generateOraclePDFReport(table, con);
				}

				con.close();
		}


	}

	public enum DatabaseType {
		MYSQL,
		ORACLE,
	}

	public enum ReportType {
		HTML,
		PDF,
	}
}
