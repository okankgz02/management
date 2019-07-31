package com.okankgz.management.service;

import com.okankgz.management.entity.Project;
import sun.jvm.hotspot.debugger.Page;

import java.awt.print.Pageable;

public interface ProjectService {

    Project save(Project project);
    Project getById(Long id);

   // Page<Project> getAllPageable(Pageable pageable);
}
