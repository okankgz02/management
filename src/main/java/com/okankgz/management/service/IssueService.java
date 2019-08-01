package com.okankgz.management.service;

import com.okankgz.management.dto.IssueDto;
import com.okankgz.management.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {


    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    Page<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
