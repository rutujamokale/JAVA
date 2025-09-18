package com.example.demo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entities.EvaluationCriteria;
import com.example.demo1.services.EvaluationCriteriaService;

@RestController
public class EvaluationCriteriaController {

    @Autowired
    private EvaluationCriteriaService svc;

    @PostMapping("/eva/criteria")
    public boolean postInsertCriteria(@RequestBody EvaluationCriteria criteria) {
        return svc.insertCriteria(criteria);
    }

    @PutMapping("{id}/subjects/{subjectId}")
    public boolean putupdateSubject(@RequestParam int id, @RequestParam int subjectId) {
        return svc.updateSubject(id, subjectId);
    }

    @PutMapping("{evaluationCriteriaId}/questions/{questionId}")
    public boolean putupdateCriteria(@RequestParam int EvaluationCriteriaId, @RequestParam int questionId) {
        return svc.updateCriteria(EvaluationCriteriaId, questionId);
    }
}
