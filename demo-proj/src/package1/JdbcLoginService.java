package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class JdbcLoginService {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/mytest";
	private static String pass = "";
	private static String uname = "root";

	public static boolean Loginuser(NewUser boy)
	{

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement stmt = (Statement) con.createStatement();

			String sql = "SELECT * FROM STUD";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				String unm = rs.getString("username");
				String pass = rs.getString("password");
				if (unm.equals(boy.getUsername())) {
					return true;

				}

			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;

	}
}
