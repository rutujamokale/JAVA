package com.tfl.dockersubjectapi.Controller;
import com.tfl.dockersubjectapi.Service.SubjectService;
import com.tfl.dockersubjectapi.Entity.Subject;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService svc;

    public SubjectController(SubjectService svc) {
        this.svc = svc;
    }

    @GetMapping("/subjects")
    public CompletableFuture<List<Subject>> getAllSubjects() {
        return svc.getAllSubjects();
    }

    @PostMapping("/add")
    public CompletableFuture<Integer> addSubject(@RequestBody Subject subject) {
        return svc.addSubject(subject);
    }

    @DeleteMapping("/{id}")
    public CompletableFuture<Integer> deleteSubject(@PathVariable int id) {
        return svc.deleteSubject(id);
    }
}
