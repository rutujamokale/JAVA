package com.example.demo1.services;
import org.springframework.stereotype.Service;

import com.example.demo1.entities.EvaluationCriteria;

@Service
public interface EvaluationCriteriaService {

    public boolean updateSubject(int id,int subjectId);
    public boolean insertCriteria(EvaluationCriteria criteria);
    public boolean updateCriteria(int evaluationCriteriaId, int questionId);
    
}
