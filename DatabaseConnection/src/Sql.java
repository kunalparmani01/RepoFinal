import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;

public class Sql {
	
	public static void main(String args[]) throws ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://"+System.getenv("DBHOST")+"/db1000174";
				String username = System.getenv("DBUSER");
				String password = System.getenv("DBPASSWORD");
				Connection dbCon = null;
	
				try { 
					dbCon = (Connection) DriverManager.getConnection(dbURL, username, password);
					System.out.println("Success");
				}
    catch (SQLException ex)
				{ Logger.getLogger(Collection.class.getName()).log(Level.SEVERE, null, ex); }
				finally{  }


	
	}
	

}
