package jdbcmaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "pranav7262";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("connected to database!!!!");
            System.out.println(connection);
        } catch (SQLException e) {
            System.out.println("connection failed" + e.getSQLState());
        }
    }

}