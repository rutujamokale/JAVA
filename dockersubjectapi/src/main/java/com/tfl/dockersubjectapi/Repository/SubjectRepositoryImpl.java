package com.tfl.dockersubjectapi.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tfl.dockersubjectapi.Entity.Subject;

import jakarta.annotation.PostConstruct;

@Repository
public class SubjectRepositoryImpl implements SubjectRepository {

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.driver}")
    private String driver;

    private Connection conn;
    private PreparedStatement ps;
    private Statement st;
  @PostConstruct
    public void init() {
        try {
            // If injection fails, it might contain the ${} characters
            if (driver == null || driver.contains("${")) {
                driver = "com.mysql.cj.jdbc.Driver"; 
            }
            Class.forName(driver);
            this.conn = DriverManager.getConnection(url, username, password);
            // Initialize the statement so display() doesn't throw a NullPointerException later
            this.st = conn.createStatement(); 
        } catch (Exception e) {
            System.err.println("Database Connection Failed: " + e.getMessage());
        }
    }

    // ✅ Get All Subjects
    @Override
    public List<Subject> getAllSubjects() {

        List<Subject> subjects = new ArrayList<>();
        String query = "SELECT id, title FROM subjects";

        try (Connection connection = conn;
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                Subject subject = new Subject();
                subject.setId(rs.getInt("id"));
                subject.setTitle(rs.getString("title"));
                subjects.add(subject);
            }

        } catch (Exception e) {
            System.out.println("Error fetching subjects: " + e.getMessage());
        }

        return subjects;
    }

    // ✅ Add Subject
    @Override
    public int addSubject(Subject subject) {

        String query = "INSERT INTO subjects (title) VALUES (?)";

        try (Connection connection = conn;
             PreparedStatement statement =
                     connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, subject.getTitle());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1); // return generated ID
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error adding subject: " + e.getMessage());
        }

        return -1; // if insert fails
    }

    // ✅ Delete Subject
    @Override
    public int deleteSubject(int subjectId) {

        String query = "DELETE FROM subjects WHERE id = ?";

        try (Connection connection = conn;
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, subjectId);

            return statement.executeUpdate(); // returns rows deleted

        } catch (Exception e) {
            System.out.println("Error deleting subject: " + e.getMessage());
        }

        return -1;
    }
}