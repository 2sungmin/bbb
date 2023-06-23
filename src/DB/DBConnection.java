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
			// 연결이 되면 해당 문구가 실행된다.
			return DriverManager.getConnection(connectionUrl);
		
		} catch (ClassNotFoundException e) {			
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;		
	}
}