package jdbcmaster;

import java.sql.*;

public class PreparedUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String query = "UPDATE student set marks= ?  WHERE id = ?";
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
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, 95.77);
            preparedStatement.setInt(2,7);


            int rowsaffected = preparedStatement.executeUpdate();
            if (rowsaffected>0){
                System.out.println("UPDATION Successful");
            }
            else {
                System.out.println("updation failed");
            }

            connection.close();
            System.out.println();
            System.out.println("All connections were closed!!!");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        }


    }
}
