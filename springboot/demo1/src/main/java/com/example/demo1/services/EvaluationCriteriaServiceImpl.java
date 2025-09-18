package com.example.demo1.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.repository.EvaluationCriteriaRepository;
import com.example.demo1.entities.EvaluationCriteria;
@Service

public class EvaluationCriteriaServiceImpl  implements EvaluationCriteriaService{

    @Autowired
    private EvaluationCriteriaRepository _repo;

    public EvaluationCriteriaServiceImpl(EvaluationCriteriaRepository repo){
        this._repo=repo;
    }
    

    @Override
    public boolean updateSubject(int id, int subjectId) {

        return _repo.updateSubject( id, subjectId);
        
    }

    @Override
    public boolean insertCriteria(EvaluationCriteria criteria) {
        return _repo.insertCriteria( criteria);
    }

    @Override
    public boolean updateCriteria(int evaluationCriteriaId, int questionId) {
        return _repo.updateCriteria(evaluationCriteriaId, questionId);
       
    }
}
