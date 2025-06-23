package jdbcmaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String withDrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
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
            try {
                PreparedStatement withdrawStatement = connection.prepareStatement(withDrawQuery);
                PreparedStatement depositStatement = connection.prepareStatement(depositQuery);
                withdrawStatement.setDouble(1,500.00);
                withdrawStatement.setString(2,"ACCOUNT123");
                depositStatement.setDouble(1,500.00);
                depositStatement.setString(2,"ACCOUNT456");
                int rowsAffectedWithdraw = withdrawStatement.executeUpdate();
                int rowsAffectedDeposit  = depositStatement.executeUpdate();
                if (rowsAffectedWithdraw >0 && rowsAffectedDeposit > 0){
                    connection.commit();
                    System.out.println("Transaction Successful...");
                }
               else {
                   connection.rollback();
                    System.out.println("Transaction Unsuccessful...");
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
