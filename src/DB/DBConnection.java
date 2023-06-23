package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		String connectionUrl =
                "jdbc:sqlserver://localhost;"
                    + "encrypt=true;"
                      + "instanceName=SQLEXPRESS;"
                    + "integratedSecurity=true;"
                        + "database=CafeProgram;"
                        + "trustServerCertificate=true;"
                        + "user=root;"
                        + "password=1234;";	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			// ������ �Ǹ� �ش� ������ ����ȴ�.
			return DriverManager.getConnection(connectionUrl);
		
		} catch (ClassNotFoundException e) {			
			System.out.println("jdbc driver �ε� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;		
	}
}