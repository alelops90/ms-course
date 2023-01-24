package com.alelops.hrworker.resources;

import com.alelops.hrworker.entites.Worker;
import com.alelops.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

    @Autowired
    private WorkerRepository repository;

    @GetMapping("/all")
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
