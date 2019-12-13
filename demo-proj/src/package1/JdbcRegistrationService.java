package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;



public class JdbcRegistrationService {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/mytest";
	private static String pass= "";
	private static String uname="root";
	
	
	public static void registerUser(User user) throws Exception
	{
		
		
			
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, uname, pass);
			String sql="INSERT INTO STUD (USERNAME,EMAIL,PASSWORD,MOBILE) VALUES(?, ?, ?, ?)";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getMobile());
			ps.executeUpdate();
			
			
			
		
	}

}
