package jdbcmaster;

import java.sql.*;
public class DeleteEntry {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String query = "DELETE from student WHERE id=4";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded successfully");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");
            Statement statement = connection.createStatement();

            int rowsaffected = statement.executeUpdate(query);
            if (rowsaffected>0){
                System.out.println("DELETION Successful "+rowsaffected +" row(s) affected.");
            }
            else {
                System.out.println("deletion failed");
            }

            statement.close();
            connection.close();
            System.out.println();
            System.out.println("All connections were closed!!!");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
