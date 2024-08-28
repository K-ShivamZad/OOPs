import java.sql.*;

public class MySQLJDBCExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            // Registering the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing a connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Creating a statement object
            Statement statement = connection.createStatement();

            // Creating a table named 'students'
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50) NOT NULL," +
                    "age INT NOT NULL)";
            statement.executeUpdate(createTableQuery);
            System.out.println("Table 'students' created successfully.");

            // Inserting values into the table
            String insertQuery = "INSERT INTO students (name, age) VALUES ('Alice', 25), ('Bob', 28), ('Charlie', 22)";
            int rowsAffected = statement.executeUpdate(insertQuery);
            System.out.println(rowsAffected + " row(s) inserted into 'students' table.");

            // Closing resources
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
