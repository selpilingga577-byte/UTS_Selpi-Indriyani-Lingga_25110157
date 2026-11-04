package dao;

import model.Barang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BarangDAO {

    // SIMPAN DATA
    public boolean simpan(Barang b) {

        String sql = "INSERT INTO barang "
                + "(kode_barang, nama_barang, kategori, stok) "
                + "VALUES (?, ?, ?, ?)";

        try (Connection c = Koneksi.getConnection()) {

            if (c == null) {
                return false;
            }

            try (PreparedStatement ps = c.prepareStatement(sql)) {

                ps.setString(1, b.getKodeBarang());
                ps.setString(2, b.getNamaBarang());
                ps.setString(3, b.getKategori());
                ps.setInt(4, b.getStok());

                return ps.executeUpdate() > 0;
            }

        } catch (SQLException e) {

            System.out.println("Gagal menyimpan: " + e.getMessage());
            return false;
        }
    }

    // TAMPIL DATA
    public List<Barang> tampilkan() {

        List<Barang> data = new ArrayList<>();

        String sql = "SELECT * FROM barang";

        try (Connection c = Koneksi.getConnection()) {

            if (c == null) {
                return data;
            }

            try (Statement st = c.createStatement();
                 ResultSet rs = st.executeQuery(sql)) {

                while (rs.next()) {

                    Barang b = new Barang(
                            rs.getString("kode_barang"),
                            rs.getString("nama_barang"),
                            rs.getString("kategori"),
                            rs.getInt("stok")
                    );

                    data.add(b);
                }
            }

        } catch (SQLException e) {

            System.out.println("Gagal menampilkan: " + e.getMessage());
        }

        return data;
    }

    // UBAH DATA
    public boolean ubah(Barang b) {

        String sql = "UPDATE barang SET "
                + "nama_barang=?, kategori=?, stok=? "
                + "WHERE kode_barang=?";

        try (Connection c = Koneksi.getConnection()) {

            if (c == null) {
                return false;
            }

            try (PreparedStatement ps = c.prepareStatement(sql)) {

                ps.setString(1, b.getNamaBarang());
                ps.setString(2, b.getKategori());
                ps.setInt(3, b.getStok());
                ps.setString(4, b.getKodeBarang());

                return ps.executeUpdate() > 0;
            }

        } catch (SQLException e) {

            System.out.println("Gagal mengubah: " + e.getMessage());
            return false;
        }
    }

    // HAPUS DATA
    public boolean hapus(String kode) {

        String sql = "DELETE FROM barang WHERE kode_barang=?";

        try (Connection c = Koneksi.getConnection()) {

            if (c == null) {
                return false;
            }

            try (PreparedStatement ps = c.prepareStatement(sql)) {

                ps.setString(1, kode);

                return ps.executeUpdate() > 0;
            }

        } catch (SQLException e) {

            System.out.println("Gagal menghapus: " + e.getMessage());
            return false;
        }
    }
}