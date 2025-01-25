package bank.management.system;

import java.sql.*;

public class Conn {

	Connection connection;
	java.sql.Statement statement;
	public Conn() {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","12345");
			statement=connection.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
