package com.example.demo1.repository;
import org.springframework.stereotype.Repository;

import com.example.demo1.entities.EvaluationCriteria;
@Repository

public interface EvaluationCriteriaRepository{

    public boolean updateSubject(int id,int subjectId);
     public boolean insertCriteria(EvaluationCriteria criteria);

     public boolean updateCriteria(int EvaluationCriteriaId, int questionId);

    
}