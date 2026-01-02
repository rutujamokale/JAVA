package com.transflower.Repository;

import java.util.List;

import com.transflower.project.entities.AnnualcandidateResult;

public interface  AssessmentIntelligenceRepository {
    List<AnnualcandidateResult> getCandidateResults(int candidateId,int year);
}
