package com.thinkopen.patterns.structural.facade;

import java.sql.Connection;
import java.sql.SQLException;
import static com.thinkopen.patterns.structural.facade.HelperFacade.DatabaseType;
import static com.thinkopen.patterns.structural.facade.HelperFacade.ReportType;

public class FacadePatternTest {

	public static void main(String[] args) throws SQLException {
		final String table = "employee";

        // Molto più prolisso
		generateReportsWithoutFacade(table);

		// Più snello
		HelperFacade.generateReport(DatabaseType.MYSQL, ReportType.HTML, table);
		HelperFacade.generateReport(DatabaseType.ORACLE, ReportType.PDF, table);
	}

	private static void generateReportsWithoutFacade(final String table) throws SQLException {
        final MySQLHelper mySQLHelper = new MySQLHelper();
        final OracleHelper oracleHelper = new OracleHelper();

        Connection mySQLCon = MySQLHelper.getMySQLDBConnection();
        mySQLHelper.generateMySQLHTMLReport(table, mySQLCon);
        mySQLCon.close();

        Connection oracleCon = OracleHelper.getOracleDBConnection();
        oracleHelper.generateOracleHTLMReport(table, mySQLCon);
        oracleCon.close();
    }
}
