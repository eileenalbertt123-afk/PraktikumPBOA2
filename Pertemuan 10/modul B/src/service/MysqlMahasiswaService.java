package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Mahasiswa;
import utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    public MysqlMahasiswaService() {

        koneksi = MysqlUtility.getConnection();
    }

    public void add(Mahasiswa mhs) {

        String sql =
                "INSERT INTO mahasiswa VALUES (?, ?)";

        try {

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setInt(1, mhs.getId());

            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Berhasil insert");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
    
    public void update(Mahasiswa mhs) {

    String sql =
            "UPDATE mahasiswa SET nama=? WHERE id=?";

    try {

        PreparedStatement ps =
                koneksi.prepareStatement(sql);

        ps.setString(1, mhs.getNama());

        ps.setInt(2, mhs.getId());

        ps.executeUpdate();

        System.out.println("Berhasil update");

    } catch (SQLException e) {

        System.out.println(e.getMessage());
    }
}
    
    public void delete(int id) {

    String sql =
            "DELETE FROM mahasiswa WHERE id=?";

    try {

        PreparedStatement ps =
                koneksi.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Berhasil delete");

    } catch (SQLException e) {

        System.out.println(e.getMessage());
    }
}
    
    public Mahasiswa getById(int id) {

    String sql =
            "SELECT * FROM mahasiswa WHERE id=?";

    try {

        PreparedStatement ps =
                koneksi.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs =
                ps.executeQuery();

        if (rs.next()) {

            return new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
            );
        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());
    }

    return null;
}
    
    public List<Mahasiswa> getAll() {

    List<Mahasiswa> list =
            new ArrayList<>();

    String sql =
            "SELECT * FROM mahasiswa";

    try {

        Statement st =
                koneksi.createStatement();

        ResultSet rs =
                st.executeQuery(sql);

        while (rs.next()) {

            Mahasiswa m =
                    new Mahasiswa(
                            rs.getInt("id"),
                            rs.getString("nama")
                    );

            list.add(m);
        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());
    }

    return list;
}
}