package jdbcmaster;

import java.io.*;
import java.sql.*;

public class ImageToFolderAccess {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "pranav7262";
        String folder_path = "C:\\Users\\dell\\OneDrive\\Desktop\\its_me\\";
        String query = "SELECT image_data from image_table WHERE image_id = (?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully..");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("connected to database!!!!");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                byte[] imagedata = resultSet.getBytes("image_data");
                String image_path = folder_path+"pranav.jpg";
                OutputStream outputStream = new FileOutputStream(image_path);
                outputStream.write(imagedata);
                System.out.println("Image found Successfully...");
            } else {
                System.out.println("Image cant fount");
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
