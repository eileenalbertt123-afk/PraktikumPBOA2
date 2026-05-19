package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3307/jdbc_mhs";

                String user = "root";

                String password = "";

                koneksi =
                        DriverManager.getConnection(
                                url,
                                user,
                                password
                        );

                System.out.println("Koneksi berhasil");

            } catch (ClassNotFoundException e) {

                System.out.println("Driver tidak ditemukan");

            } catch (SQLException e) {

                System.out.println("Koneksi gagal");
            }
        }

        return koneksi;
    }
}