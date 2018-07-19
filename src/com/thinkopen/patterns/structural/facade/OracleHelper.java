package com.thinkopen.patterns.structural.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection() {
		// Ritorna una connessione al DB Oracle
		return null;
	}

	public void generateOraclePDFReport(String table, Connection con) {
		// Genera un report PDF del contenuto del DB
	}

	public void generateOracleHTMLReport(String table, Connection con) {
		// Genera un report HTML del contenuto del DB
	}
}
