package jdbcmaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers are Loaded..");

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established successfully");
            connection.setAutoCommit(false);
            String query = "INSERT INTO student (name,age,marks) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                System.out.println("Enter Marks: ");
                Double marks = sc.nextDouble();
                preparedStatement.setString(1,name);
                preparedStatement.setInt(2,age);
                preparedStatement.setDouble(3,marks);
                sc.nextLine();
                preparedStatement.addBatch();
                System.out.println("Add more Values (Y / N) : ");
                String decision = sc.nextLine();
                if (decision.toUpperCase().equals("N")){
                    break;
                }
            }
            int [] batchResult = preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch Execute successfully !!!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
