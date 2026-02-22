package com.tfl.dockersubjectapi.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.tfl.dockersubjectapi.Entity.Subject;

public interface SubjectService {
    public CompletableFuture<List<Subject>> getAllSubjects();

     public CompletableFuture<Integer> addSubject(Subject subject);
    
    public CompletableFuture<Integer> deleteSubject(int subjectId);
}
