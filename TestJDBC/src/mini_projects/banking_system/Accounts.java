package mini_projects.banking_system;

import java.sql.*;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    public Accounts(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }
    public long open_account(String email){
        if(!account_exits(email)){
           String open_query = "INSERT INTO accounts(account_number,full_name,email,security_pin,balance) VALUES(?, ?, ?, ?, ?)";
           scanner.nextLine();
            System.out.println("Enter Full name: ");
            String name = scanner.nextLine();
            System.out.println("Enter security pin: ");
            String security_pin = scanner.nextLine();
            System.out.println("Initial amount: ");
            Double balance = scanner.nextDouble();
            try {
                long account_number = generateAccountNumber();
                PreparedStatement preparedStatement = connection.prepareStatement(open_query);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,email);
                preparedStatement.setString(4,security_pin);
                preparedStatement.setDouble(5,balance);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0){
                    return account_number;
                } else {
                    throw new RuntimeException("Account creation failed");
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        throw new RuntimeException("Account already exist");
    }

    private long generateAccountNumber() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT account_number FROM accounts ORDER BY account_number DESC LIMIT 1");
            if (resultSet.next()) {
                long last_accnum = resultSet.getLong("account_number");
                return last_accnum+1;
            } else {
                return 10000100;//default num.
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return 10000100;
    }
    public long get_Accountnumber(String email){
        String sql = "SELECT account_number from accounts WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return resultSet.getLong("account_number");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        throw new RuntimeException("Account number doesn't exists");
    }

    public boolean account_exits(String email) {
        String query = "SELECT * FROM accounts WHERE email = ?";
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
