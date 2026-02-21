package com.tfl.Subjectapi.Controller;

import java.util.List;
import com.tfl.Subjectapi.Entity.Subject;
import com.tfl.Subjectapi.Service.SubjectService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfl.Subjectapi.Service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
    
    private final SubjectService service;

    public SubjectController(SubjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return service.getAllSubjects();
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return service.addSubject(subject);
    }

    @DeleteMapping("/{id}")
    public String deletesubject(@PathVariable int id) {
        service.deleteSubject(id);
        return "deleted sucessfully";
    }
}
