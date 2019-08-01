package com.okankgz.management.service.impl;

import com.okankgz.management.entity.Project;
import com.okankgz.management.repository.ProjectRepository;
import com.okankgz.management.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

  private final ProjectRepository projectRepository;

  public ProjectServiceImpl(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  @Override
  public Project save(Project project) {
    if (project.getProjectCode() == null) {
      throw new IllegalArgumentException("Project code can not be null ");
    }
    return projectRepository.save(project);
  }

  @Override
  public Project getById(Long id) {
    return null;
  }

  @Override
  public List<Project> getByProjectCode(String projectCode) {
    return null;
  }

  @Override
  public List<Project> getByProjectCodeContains(String projectCode) {
    return null;
  }

  @Override
  public Page<Project> getAllPageable(Pageable pageable) {
    return null;
  }

  @Override
  public Boolean delete(Project project) {
    return null;
  }
}
