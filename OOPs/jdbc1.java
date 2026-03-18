import java.sql.*;

class jdbc1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_name = "bcab";
            String username = "root";
            String password = "";
            String jdbc_with_sql = "jdbc:mysql://localhost:3306/" + db_name;
            Connection con = DriverManager.getConnection(jdbc_with_sql, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
                        + " " + rs.getString(5));
            }
            con.close();
            
        } 
catch (Exception e) 
{
            System.out.println(e);
        }
    }
}