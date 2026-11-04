package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/db_inventori";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(
                    url, user, password
            );

        } catch (SQLException e) {

            System.out.println("Koneksi database gagal!");
            System.out.println(e.getMessage());

            return null;
        }
    }
}