package com.tfl.dockersubjectapi.Repository;

import java.util.List;

import com.tfl.dockersubjectapi.Entity.Subject;

public interface SubjectRepository {
      List<Subject> getAllSubjects();

    int addSubject(Subject subject);
    
    int deleteSubject(int subjectId);
}
