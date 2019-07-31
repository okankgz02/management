package com.okankgz.management.repo;

import com.okankgz.management.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Issue,Long> {
}
