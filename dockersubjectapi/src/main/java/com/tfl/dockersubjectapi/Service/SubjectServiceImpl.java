package com.tfl.dockersubjectapi.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.tfl.dockersubjectapi.Entity.Subject;
import com.tfl.dockersubjectapi.Repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository _repo;
    @Autowired
    public SubjectServiceImpl(SubjectRepository repo)
    {
        _repo=repo;
    }
    @Async("asyncExecutor")
    @Override
    public CompletableFuture<List<Subject>> getAllSubjects() {
       return CompletableFuture.completedFuture(_repo.getAllSubjects());
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Integer> addSubject(Subject subject) {
        return CompletableFuture.completedFuture( _repo.addSubject(subject));
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Integer> deleteSubject(int subjectId) {
      return CompletableFuture.completedFuture(_repo.deleteSubject(subjectId)) ;
    }
    
}
