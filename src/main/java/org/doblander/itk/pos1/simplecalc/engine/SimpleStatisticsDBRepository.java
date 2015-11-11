/**
 * 
 */
package org.doblander.itk.pos1.simplecalc.engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author intruder
 *
 */
public class SimpleStatisticsDBRepository implements IStatisticRepository {

	private static final String DB_URL = "";
	private static final String DB_DRIVER_CLASS = "";
	private Connection connection;

	public SimpleStatisticsDBRepository() {
		initializeConnection();

	}

	@Override
	public void save(double[] numbers, String operation) {
		// TODO Auto-generated method stub

	}

	private void initializeConnection() {
		
		try {
			Class.forName(DB_DRIVER_CLASS);
		} catch (ClassNotFoundException e1) {
			System.out.println("ERROR: DB driver could not be loaded!");
			e1.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(DB_URL);
		} catch (SQLException e) {
			System.out.println("ERROR: It was not possible to establish a connection to the database!");
			e.printStackTrace();
		} finally {
			// no cleanup necessary as no connection was returned
		}
	}
}
