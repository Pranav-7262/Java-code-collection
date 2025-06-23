package jdbcmaster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Image_Access {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String image_path = "C:\\Users\\dell\\OneDrive\\Desktop\\its_me\\me.jpg";
        String query = "INSERT INTO image_table(image_data) VALUES(?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully..");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
        Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("connected to database!!!!");
            FileInputStream fileInputStream = new FileInputStream(image_path);
            byte[] imagedata = new byte[fileInputStream.available()];
            fileInputStream.read(imagedata);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setBytes(1,imagedata);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Image Inserted Successfully..");
            } else  {
                System.out.println("Image cant inserted");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
