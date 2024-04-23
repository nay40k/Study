package org.equipmentmanager.db.dao;

import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.OfficeEquipment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeEquipmentDAO implements DAO<OfficeEquipment> {

    @Override
    public void add(OfficeEquipment equipment) {
        String sql = "INSERT INTO equipment (type, serialNumber, cost, status, user, location) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, equipment.getType());
            pstmt.setString(2, equipment.getSerialNumber());
            pstmt.setDouble(3, equipment.getCost());
            pstmt.setString(4, equipment.getStatus());
            pstmt.setString(5, equipment.getUser());
            pstmt.setString(6, equipment.getLocation());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public OfficeEquipment getById(String id) {
        String sql = "SELECT * FROM equipment WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new OfficeEquipment(
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getString("serialNumber"),
                        rs.getDouble("cost"),
                        rs.getString("status"),
                        rs.getString("user"),
                        rs.getString("location")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<OfficeEquipment> getAll() {
        List<OfficeEquipment> equipmentList = new ArrayList<>();
        String sql = "SELECT * FROM equipment";
        try (Connection conn = DBConnector.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                equipmentList.add(new OfficeEquipment(
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getString("serialNumber"),
                        rs.getDouble("cost"),
                        rs.getString("status"),
                        rs.getString("user"),
                        rs.getString("location")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return equipmentList;
    }

    @Override
    public void update(OfficeEquipment equipment) {
        String sql = "UPDATE equipment SET type = ?, serialNumber = ?, cost = ?, status = ?, user = ?, location = ? WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, equipment.getType());
            pstmt.setString(2, equipment.getSerialNumber());
            pstmt.setDouble(3, equipment.getCost());
            pstmt.setString(4, equipment.getStatus());
            pstmt.setString(5, equipment.getUser());
            pstmt.setString(6, equipment.getLocation());
            pstmt.setInt(7, equipment.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteById(String id) {
        String sql = "DELETE FROM equipment WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
