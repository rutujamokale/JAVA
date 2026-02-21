package com.tfl.Subjectapi.Service;

import java.util.List;

import com.tfl.Subjectapi.Entity.Subject;

public interface SubjectService {

    public abstract List<Subject> getAllSubjects();

    public abstract Subject addSubject(Subject subject);

    public abstract void deleteSubject(int id);
}
