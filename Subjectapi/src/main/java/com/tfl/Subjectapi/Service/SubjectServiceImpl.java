package com.tfl.Subjectapi.Service;

import org.springframework.stereotype.Service;

import com.tfl.Subjectapi.Repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository repository;

    public SubjectServiceImpl(SubjectRepository repository) {
        this.repository = repository;
    }

    @Override

    

}
