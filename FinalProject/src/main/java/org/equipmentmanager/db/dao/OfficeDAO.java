package org.equipmentmanager.db.dao;

import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.Office;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeDAO implements DAO<Office> {


    @Override
    public void add(Office office) {
        String sql = "INSERT INTO offices (address, department) VALUES (?, ?)";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, office.getAddress());
//            pstmt.setString(1, SatelliteUIClass.getEntityName());
            pstmt.setString(2, office.getDepartment());
//            pstmt.setString(2, SatelliteUIClass.getEntityName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Office getById(String id) {
        String sql = "SELECT * FROM offices WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Office office = new Office();
                office.setAddress(rs.getString("address"));
                office.setDepartment(rs.getString("department"));
                return office;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Office> getAll() {
        List<Office> offices = new ArrayList<>();
        String sql = "SELECT * FROM offices";
        try (Connection conn = DBConnector.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Office office = new Office();
                office.setId(rs.getInt("id"));
                office.setAddress(rs.getString("address"));
                office.setDepartment(rs.getString("department"));
                offices.add(office);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return offices;
    }

    @Override
    public void update(Office office) {
        String sql = "UPDATE offices SET department = ? WHERE address = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, office.getDepartment());
            pstmt.setString(2, office.getAddress());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteById(String id) {
        String sql = "DELETE FROM offices WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
