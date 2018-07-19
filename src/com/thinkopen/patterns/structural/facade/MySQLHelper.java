package com.thinkopen.patterns.structural.facade;

import java.sql.Connection;

public class MySQLHelper {

	public static Connection getMySQLDBConnection() {
		// Ritorna una connessione al DB MySQL
		return null;
	}

	public void generateMySQLPDFReport(String table, Connection con) {
		// Genera un report PDF del contenuto del DB
	}

	public void generateMySQLHTMLReport(String table, Connection con) {
		// Genera un report HTML del contenuto del DB
	}
}
