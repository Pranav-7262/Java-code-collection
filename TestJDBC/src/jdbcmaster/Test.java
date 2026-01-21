package jdbcmaster;

import java.sql.*;
public class Test {
    public static void main(String[] args)  {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String query = "select * from student;";
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
            ResultSet resultSet =  statement.executeQuery(query);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name  = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Double marks = resultSet.getDouble("marks");
                System.out.println();
                System.out.println("----------------------");
                System.out.println("id :"+id);
                System.out.println("name :"+name);
                System.out.println("age :"+age);
                System.out.println("marks :"+marks);

            }
            resultSet.close();
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
