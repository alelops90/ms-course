package com.alelops.hrworker.repositories;

import com.alelops.hrworker.entites.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
