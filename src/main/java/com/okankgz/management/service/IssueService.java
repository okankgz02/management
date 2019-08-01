package com.okankgz.management.service;

import com.okankgz.management.dto.IssueDto;
import com.okankgz.management.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

  IssueDto save(IssueDto issue);

  IssueDto getById(Long id);

  TPage<IssueDto> getAllPageable(Pageable pageable);

  Boolean delete(IssueDto issue);
}
