package com.tap.tfl.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tap.tfl.entity.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    // 🔌 Connection method
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, username, password);
    }

    // ✅ CREATE
    @Override
    public int createEmployee(Employee emp) {
        String query = "INSERT INTO employees (first_name, last_name, email) VALUES (?, ?, ?)";

        try (
                Connection conn = getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, emp.getFirst_name());
            st.setString(2, emp.getLast_name());
            st.setString(3, emp.getEmail());

            return st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // ✅ GET ALL
    @Override
    public List<Employee> getAllEmployees() {
        String query = "SELECT * FROM employees";
        List<Employee> list = new ArrayList<>();

        try (
                Connection conn = getConnection(); PreparedStatement st = conn.prepareStatement(query); ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email")
                );
                list.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // ✅ GET BY ID
    @Override
    public Employee getEmployeeById(Long id) {
        String query = "SELECT * FROM employees WHERE id = ?";

        try (
                Connection conn = getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                return new Employee(
                        rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // ✅ UPDATE
    @Override
    public int updateEmployee(Long id, Employee emp) {
        String query = "UPDATE employees SET first_name=?, last_name=?, email=? WHERE id=?";

        try (
                Connection conn = getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, emp.getFirst_name());
            st.setString(2, emp.getLast_name());
            st.setString(3, emp.getEmail());
            st.setLong(4, id);

            return st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // ✅ DELETE
    @Override
    public int deleteEmployee(Long id) {
        String query = "DELETE FROM employees WHERE id=?";

        try (
                Connection conn = getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setLong(1, id);
            return st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
