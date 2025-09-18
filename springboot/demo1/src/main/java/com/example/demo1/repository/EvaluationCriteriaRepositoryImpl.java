package com.example.demo1.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.demo1.entities.EvaluationCriteria;


@Repository
public class EvaluationCriteriaRepositoryImpl implements EvaluationCriteriaRepository {
    
    private String url="jdbc:mysql://localhost:3306/assessmentdb";
    private String username="root";
    private String password="password";


    @Override
    public boolean updateSubject(int id,int subjectId){
     String query="Update evaluationcriterias set subjectId=? where id=? ";

        try {
                Connection connection=DriverManager.getConnection(url,username,password);
                PreparedStatement statement=connection.prepareStatement(query);


                statement.setInt(1,subjectId);
                statement.setInt(2,id);
                statement.executeUpdate();
                return true;


            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            
        }

    }

    @Override
     public boolean insertCriteria(EvaluationCriteria criteria){
        String query="insert into EvaluationCriterias(Title,SubjectId) values(? ,?) ";

        try {
             Connection connection=DriverManager.getConnection(url,username,password);
             PreparedStatement statement= connection.prepareStatement(query);

             statement.setString(1,criteria.getTitle());
             statement.setInt(2,criteria.getSubjectId());
             statement.executeUpdate();
             return true;

            


        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
     }
     @Override
    public boolean updateCriteria(int evaluationCriteriaId,int questionId) {
        String query = "UPDATE questionbank SET evaluationcriteriaid = ? WHERE id = ?";
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(query);
        
            statement.setInt(1, evaluationCriteriaId);
            statement.setInt(2, questionId);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}
