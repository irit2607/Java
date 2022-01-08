import java.sql.Connection;

public class JdbcDemo                                                                       // Java databse connection
{
	public static void main(String[] args) throws SQLException{
	    // Creating the database Connection
          String url = "jdbc:postgresql://localhost/test";
          Connection conn = null;
          
          int rollno = 2;
          String name = "Irit";
          
          String sql = "insert into student(rollno, name) " + "values(" + rollno + ", '" + name + "')";
          
          try{
              conn = DriverManager.getConnection(url, "userId", "password");
              
              Statement st = conn.createStatement();
              int m = st.executeUpdate(sql);
              
              if(m==1)
              {
                  System.out.println("inserted successfully : " + sql);
              }
              else{
                  System.out.println("insertion failed");
              }
          }
          catch(Exception e)
          {
              System.err.println(e);
          }
          finally
          {
              conn.close();
          }
	}
}
