package com.zuptrainingcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zuptrainingcloud.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
