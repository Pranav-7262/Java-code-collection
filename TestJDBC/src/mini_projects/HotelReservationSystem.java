package mini_projects;

import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {
    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "pranav7262";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            while (true) {
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Reserve a Room");
                System.out.println("2. View reservation");
                System.out.println("3. Get Reservation Id ");
                System.out.println("4. Get Room number");
                System.out.println("5. Update Reservation");
                System.out.println("6. Delete Reservation");
                System.out.println("0. Exit");
                System.out.println("Choose an option : ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        reserveRoom(connection, sc);
                        break;
                    case 2:
                        viewReservaions(connection);
                        break;
                    case 3:
                        getReservationId(connection,sc);
                        break;
                    case 4:
                        getRoomNumber(connection, sc);
                        break;
                    case 5:
                        updateReservations(connection, sc);
                        break;
                    case 6:
                        deleteReservations(connection, sc);
                        break;
                    case 0:
                        exit();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void reserveRoom(Connection connection, Scanner sc) {
        try {
            System.out.println("Enter guest name");
            String guestname = sc.next();
            System.out.println("Enter room number");
            int roomnum = sc.nextInt();
            System.out.println("Enter contact number");
            String contact = sc.next();

            String sql = "INSERT INTO reservation (guest_no,room_no,contact_no) " +
                    "VALUES('" + guestname + "' ," + roomnum + ",'" + contact + "')";
            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);
                if (affectedRows > 0) {
                    System.out.println("Reservation Successful");
                } else {
                    System.out.println("Reservation failed");
                }
            }
        }
            catch (SQLException e) {
                System.out.println(e.getMessage());
        }
    }
    private static void viewReservaions(Connection connection) throws SQLException {
        String sql = "SELECT reservation_id,guest_no,room_no,contact_no,reservation_date FROM reservation";
        try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){

            while (resultSet.next()){
                int id = resultSet.getInt("reservation_id");
                String name  = resultSet.getString("guest_no");
                int roomNumber = resultSet.getInt("room_no");
                String contactNo = resultSet.getString("contact_no");
                String reservationDate = resultSet.getTimestamp("reservation_date").toString();
                System.out.println();
                System.out.println("----------------------");
                System.out.println("Reservation_id :"+id);
                System.out.println("Guest_name :"+name);
                System.out.println("room_Number :"+roomNumber);
                System.out.println("Contact_no. :"+contactNo);
                System.out.println("ReservationDate :"+reservationDate);

            }
            System.out.println("---------------+-----------------+----------------+----------------");
        }

    }
    private static void getReservationId(Connection connection, Scanner sc)  {
        try {
            System.out.println("Enter contact_number: ");
            String number = sc.next();
            System.out.println("Enter Room Number: ");
            int room_number = sc.nextInt();

            String sql ="SELECT reservation_id FROM reservation " +
                    "WHERE contact_no = " + number +
                    " AND room_no = '" + room_number + "'";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                if (resultSet.next()){
                    int reservation_id = resultSet.getInt("reservation_id");
                    System.out.println("Reservation Id for contact no " + number +
                            " and Room number " + room_number + " is: " + reservation_id);
                } else {
                    System.out.println("Reservation Id was not Found for Data");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void getRoomNumber(Connection connection, Scanner sc) {
        try {
            System.out.println("Enter Reservation Id: ");
            int reservationid = sc.nextInt();
            System.out.println("Enter Guest name: ");
            String name = sc.next();

            String sql = "SELECT room_no FROM reservation " +
                    "WHERE reservation_id = " + reservationid +
                    " AND guest_no = '" + name + "'";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                if (resultSet.next()) {
                    int roomNumber = resultSet.getInt("room_no");
                    System.out.println("Room number for Reservation ID " + reservationid +
                            " and Guest " + name + " is: " + roomNumber);
                } else {
                    System.out.println("Reservation NOT found for given ID and guest name.");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void updateReservations(Connection connection, Scanner sc) {
          try {
              System.out.println("Enter reservation_id for update");
              int reservationid = sc.nextInt();
              sc.nextLine();
              if (!reservationExists(connection,reservationid)){
                  System.out.println("Reservation not found for given ID.");
                  return;
              }
              System.out.println("Enter new guest name :");
              String name = sc.next();
              System.out.println("Enter new room number :");
              int roomnum = sc.nextInt();
              System.out.println("Enter new contact number :");
              String cno = sc.next();
              String sql = "UPDATE reservation SET guest_no = '" + name + "', " +
                      "room_no = " + roomnum + ", " +
                      "contact_no = '" + cno + "' " +
                      "WHERE reservation_id = " + reservationid;
              try(Statement statement = connection.createStatement()){
                  int affectedRows = statement.executeUpdate(sql);
                  if (affectedRows>0){
                      System.out.println("Reservation Updated Successfully...");
                  } else {
                      System.out.println("Reservation update failed..");
                  }
              }
          } catch (SQLException e){
              e.printStackTrace();
          }
    }
    private static void deleteReservations(Connection connection, Scanner sc) {
        try {
            System.out.println("Enter reservation ID : ");
            int id = sc.nextInt();
            if (!reservationExists(connection,id)){
                System.out.println("Reservation not found for given ID.");
                return;
            }
            String sql = "DELETE FROM reservation WHERE reservation_id = " + id;
            try(Statement statement = connection.createStatement()){
                int affectedRows = statement.executeUpdate(sql);
                if (affectedRows>0){
                    System.out.println("Reservation deleted Successfully...");
                } else {
                    System.out.println("Reservation deleted failed..");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static boolean reservationExists(Connection connection,int reservationID){
        try {
            String sql = "SELECT reservation_id FROM reservation WHERE reservation_id = " + reservationID;
            try(Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                return resultSet.next();
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public static void exit() throws InterruptedException {
        System.out.println("Existing system");
        int i=5;
        while (i!=0){
            System.out.print(".");
            Thread.sleep(500);
            i--;
        }
        System.out.println();
        System.out.println("Thank You For Using Hotel Management System.....");
    }

}
