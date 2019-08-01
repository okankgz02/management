package com.okankgz.management.service.impl;

import com.okankgz.management.entity.IssueHistory;
import com.okankgz.management.repository.IssueHistoryRepository;
import com.okankgz.management.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

  private final IssueHistoryRepository issueHistoryRepository;

  public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository) {
    this.issueHistoryRepository = issueHistoryRepository;
  }

  @Override
  public IssueHistory save(IssueHistory issueHistory) {

    if (issueHistory.getDate() == null) {
      throw new IllegalArgumentException("Issue can not be null");
    }
    issueHistory = issueHistoryRepository.save(issueHistory);
    return issueHistory;
  }

  @Override
  public IssueHistory getById(Long id) {
    return issueHistoryRepository.getOne(id);
  }

  @Override
  public Page<IssueHistory> getAllPageable(org.springframework.data.domain.Pageable pageable) {
    return issueHistoryRepository.findAll(pageable);
  }

  @Override
  public Boolean delete(IssueHistory issueHistory) {
    issueHistoryRepository.delete(issueHistory);
    return Boolean.TRUE;
  }
}
