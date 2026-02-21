package com.tfl.Subjectapi.Service;
import org.springframework.stereotype.Service;
import com.tfl.Subjectapi.Entity.Subject;

import java.util.List;
import com.tfl.Subjectapi.Repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository repository;

    public SubjectServiceImpl(SubjectRepository repository) {
        this.repository=repository;
    }

    @Override
    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }

    @Override

    public Subject addSubject(Subject subject) {
        return repository.save(subject);

    }

    public void deleteSubject(int id) {
        repository.deleteById(id);
    }

    

}
