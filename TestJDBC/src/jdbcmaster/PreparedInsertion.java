package jdbcmaster;

import java.sql.*;
import java.util.Scanner;

public class PreparedInsertion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String query = "INSERT INTO student(id,name,age,marks) VALUES(?, ?, ?, ?)";
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
//            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Enter your marks: ");
            Double marks = scanner.nextDouble();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,age);
            preparedStatement.setDouble(4,marks);


            int rowsaffected = preparedStatement.executeUpdate();
            if (rowsaffected>0){
                System.out.println("Insertion Successful");
            }
            else {
                System.out.println("Insertion failed");
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
