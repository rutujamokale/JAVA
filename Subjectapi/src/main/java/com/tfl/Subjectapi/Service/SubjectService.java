package com.tfl.Subjectapi.Service;

import java.util.List;

import com.tfl.Subjectapi.Entity.Subject;

public interface SubjectService {

    public  List<Subject> getAllSubjects();

    public  Subject addSubject(Subject subject);

    public void deleteSubject(int id);
}
