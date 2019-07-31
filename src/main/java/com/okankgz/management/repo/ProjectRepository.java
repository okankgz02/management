package com.okankgz.management.repo;

import com.okankgz.management.entity.Issue;
import com.okankgz.management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Issue, Long> {

    Project getByProjectCode(String projectCode);

    Project getByProjectCodeAndIdNot(String projectCode, Long id);

    List<Project> getByProjectCodeContains(String projectCode);

}
