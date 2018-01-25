import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

public class test {

   public static void main(String[] args) {

      // Declare the JDBC objects.
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
			
      try {

      	 // Create a variable for the connection string.
         String server = args[0];
         String port = args[1];
				 String user = 	args[2];
				 String password = args[3];
         String database = args[4];
				 String connectionUrl = 
					"jdbc:sqlserver://"+server+":"+port+";databaseName="+database+";user="+user+";password=" + password;

         // Establish the connection.
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con = DriverManager.getConnection(connectionUrl);

         // Create and execute an SQL statement that returns some data.
         //String SQL = "SELECT * FROM information_schema.tables";
         String SQL = "SELECT * FROM Cliente";
         stmt = con.createStatement();
         rs = stmt.executeQuery(SQL);

         // Iterate through the data in the result set and display it.
         while (rs.next()) { System.out.println(rs.getString(1)); }
				 rs.close();
				 stmt.close();
				 con.close();
      }
      // Handle any errors that may have occurred.
      catch (Exception e) {
         e.printStackTrace();
				rs = null;
				stmt = null;
				con = null;
				System.exit(1);
      }
   }
}
