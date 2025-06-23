package jdbcmaster;

import java.sql.*;

public class PreparedStatementRetrieval {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String query = "select * from student WHERE id = ? AND age = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded successfully");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");
//            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,19);
            ResultSet resultSet =  preparedStatement.executeQuery();
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
            connection.close();
            System.out.println();
            System.out.println("All connections were closed!!!");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        }


    }
}
