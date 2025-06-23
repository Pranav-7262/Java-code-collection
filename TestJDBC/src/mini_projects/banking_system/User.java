package mini_projects.banking_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    private Connection connection;
    private Scanner scanner;



    public User(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void register(){
        scanner.nextLine();
        System.out.println("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        if (user_exits(email)){
            System.out.println("User is already Existed for this email...");
            return;
        }
        String rej_query = "INSERT INTO user(full_name,email,password) VALUES(?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(rej_query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,password);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Registration Successfully !!!");
            } else {
                System.out.println("Registration Failed !!");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }

    }


    public String login(){
        scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        String login_query = "SELECT * FROM user WHERE email = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(login_query);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return email;
            } else {
                return null;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    private boolean user_exits(String email) {
        String query = "SELECT * FROM user WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

}
