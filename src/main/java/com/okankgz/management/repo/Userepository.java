package com.okankgz.management.repo;

import com.okankgz.management.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userepository extends JpaRepository<Issue,Long> {
}