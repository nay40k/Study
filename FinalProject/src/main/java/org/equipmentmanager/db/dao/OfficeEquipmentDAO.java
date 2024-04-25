package org.equipmentmanager.db.dao;

import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.OfficeEquipment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeEquipmentDAO implements DAO<OfficeEquipment> {

    @Override
    public void add(OfficeEquipment equipment) {
        String sql = "INSERT INTO equipment (type, serialNumber, cost, status, user, location) VALUES (?, ?, ?, 1, 1, 1)";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, equipment.getType());
            pstmt.setString(2, equipment.getSerialNumber());
            pstmt.setDouble(3, equipment.getCost());
//            pstmt.setString(4, equipment.getStatus());
//            pstmt.setString(5, equipment.getUser());
//            pstmt.setString(6, equipment.getLocation());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public OfficeEquipment getById(String id) {
        String sql = "SELECT * FROM equipment WHERE id = ?;";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new OfficeEquipment(
                        //TODO аналогично getAll
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getString("serialnumber"),
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
//        String sql = "SELECT * FROM equipment";
        String sql = """
                SELECT eq.id, eqt.type, eq.serialnumber, eq.cost, eqs.status, of.address, of.department, em.firstname, em.lastname
                FROM employees em, equipment eq, offices of, equipmenttypes eqt, equipmentstatuses eqs
                WHERE of.id = eq.location
                AND em.id = eq.user
                AND eqt.id = eq.type
                AND eqs.id = eq.status;""";
        try (Connection conn = DBConnector.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                equipmentList.add(new OfficeEquipment(
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getString("serialnumber"),
                        rs.getDouble("cost"),
                        rs.getString("status"),
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("address"),
                        rs.getString("department")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return equipmentList;
    }

//    @Override
//    public void update(OfficeEquipment equipment) {
//        String sql = "UPDATE equipment SET type = ?, serialNumber = ?, cost = ?, status = ?, user = ?, location = ? WHERE id = ?";
//        try (Connection conn = DBConnector.getInstance().getConnection();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, equipment.getType());
//            pstmt.setString(2, equipment.getSerialNumber());
//            pstmt.setDouble(3, equipment.getCost());
//            pstmt.setString(4, equipment.getStatus());
//            pstmt.setString(5, equipment.getUser());
//            pstmt.setString(6, equipment.getLocation());
//            pstmt.setInt(7, equipment.getId());
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    @Override
    public void update(OfficeEquipment equipment) {
//        String sql = "UPDATE equipment SET status = ?, user = ?, location = ? WHERE id = ?";
        String sql = "UPDATE equipment SET status = 2, user = ?, location = ? WHERE id = ?";
        try (Connection conn = DBConnector.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, equipment.getUser());
            pstmt.setString(2, equipment.getLocation());
            pstmt.setInt(3, equipment.getId());
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

    public List<String[]> getEqTypes() {
        List<String[]> equipmentTypes = new ArrayList<>();
        String sql = "SELECT * FROM equipmenttypes;";
        try (Connection conn = DBConnector.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String type = rs.getString("type");
                equipmentTypes.add(new String[]{id, type});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return equipmentTypes;
    }

}
