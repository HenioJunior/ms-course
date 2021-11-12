package com.heniojunior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heniojunior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
