package mini_projects.banking_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountManager {
    private Connection connection;
    private Scanner scanner;

     AccountManager(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }
    public void credit_money(long account_number) throws  SQLException {
        scanner.nextLine();
        System.out.println("Enter Amount : ");
        Double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter security pin: ");
        String pin = scanner.nextLine();
        try {
            connection.setAutoCommit(false);
            if (account_number!=0){
                String sql = "SELECT * FROM accounts WHERE account_number = ? AND security_pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,pin);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()){
                        String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
                        PreparedStatement preparedStatement1 = connection.prepareStatement(credit_query);
                        preparedStatement1.setDouble(1,amount);
                        preparedStatement1.setLong(2,account_number);
                        int rowsAffected = preparedStatement1.executeUpdate();
                        if(rowsAffected > 0){
                            System.out.println("Rs."+amount+ " Credited successfully...");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Transaction failed...");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                } else {
                    System.out.println("Invalid pin..");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }
    public void debit_money(long account_number) throws  SQLException {
         scanner.nextLine();
        System.out.println("Enter Amount : ");
        Double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter security pin: ");
        String pin = scanner.nextLine();
        try {
            connection.setAutoCommit(false);
            if (account_number!=0){
                String sql = "SELECT * FROM accounts WHERE account_number = ? AND security_pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,pin);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()){
                    double curr_amount = resultSet.getDouble("balance");
                    if (amount <= curr_amount){
                        String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
                        PreparedStatement preparedStatement1 = connection.prepareStatement(debit_query);
                        preparedStatement1.setDouble(1,amount);
                        preparedStatement1.setLong(2,account_number);
                        int rowsAffected = preparedStatement1.executeUpdate();
                        if(rowsAffected > 0){
                            System.out.println("Rs."+amount + " debited successfully...");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Transaction failed...");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                    } else {
                        System.out.println("Insufficient balance!!");
                    }
                } else {
                    System.out.println("Invalid pin..");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }
    public void transfer_money(long sender_account_number) throws  SQLException {
        scanner.nextLine();
        System.out.print("Enter Receiver Account Number: ");
        long receiver_account_number = scanner.nextLong();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
        try{
            connection.setAutoCommit(false);
            if(sender_account_number!=0 && receiver_account_number!=0){
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM accounts WHERE account_number = ? AND security_pin = ? ");
                preparedStatement.setLong(1, sender_account_number);
                preparedStatement.setString(2, security_pin);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    double current_balance = resultSet.getDouble("balance");
                    if (amount<=current_balance){

                        // Write debit and credit queries
                        String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
                        String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

                        // Debit and Credit prepared Statements
                        PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);
                        PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);

                        // Set Values for debit and credit prepared statements
                        creditPreparedStatement.setDouble(1, amount);
                        creditPreparedStatement.setLong(2, receiver_account_number);
                        debitPreparedStatement.setDouble(1, amount);
                        debitPreparedStatement.setLong(2, sender_account_number);
                        int rowsAffected1 = debitPreparedStatement.executeUpdate();
                        int rowsAffected2 = creditPreparedStatement.executeUpdate();
                        if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                            System.out.println("Transaction Successful!");
                            System.out.println("Rs."+amount+" Transferred Successfully");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Transaction Failed");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                    }else{
                        System.out.println("Insufficient Balance!");
                    }
                }else{
                    System.out.println("Invalid Security Pin!");
                }
            }else{
                System.out.println("Invalid account number");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }

    public void get_balance(long account_number){
         scanner.nextLine();
        System.out.println("Enter Security pin: ");
        String pin = scanner.nextLine();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT balance FROM accounts WHERE account_number = ? AND  security_pin = ?");
            preparedStatement.setLong(1,account_number);
            preparedStatement.setString(2,pin);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                Double total = resultSet.getDouble("balance");
                System.out.println("Balance is "+ total);
            } else {
                System.out.println("Invalid pin");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void delete_account(long account_number){
         scanner.nextLine();
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM accounts WHERE full_name = ? AND account_number = ?");
            preparedStatement.setString(1,name);
            preparedStatement.setLong(2,account_number);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected>0){
                System.out.println("Account deleted for name "+ name);
            } else {
                System.out.println("Not deleted because of some mistakes in full name");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
