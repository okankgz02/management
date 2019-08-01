package com.okankgz.management.service.impl;

import com.okankgz.management.dto.IssueDto;
import com.okankgz.management.entity.Issue;
import com.okankgz.management.repository.IssueRepository;
import com.okankgz.management.service.IssueService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

  private final IssueRepository
      issueRepository; // final ile o nesnenin runtimme değişmesini engellemiş olup nesneyi güvenli
  // hale getirir.
  // final bir nesneye constructorda atayabilir.

  private final ModelMapper modelMapper;

  @Autowired // bunu yazmasakta olur  spring bunu ınject ediyor
  public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
    this.issueRepository = issueRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public IssueDto save(IssueDto issue) {
    if (issue.getDate() == null) {
      throw new IllegalArgumentException("Issue Date can not be null");
    }
    Issue issueDb = modelMapper.map(issue, Issue.class);
    issueDb = issueRepository.save(issueDb);

    return modelMapper.map(issueDb, IssueDto.class);

    // Servisten sonraki hiç bir katmanda dtolar ile konusmayacagız ama servis ve servisten dısarı cıkarken api katmanında doğru entityleri dısarı cıkarmıyoruz.
  }

  @Override
  public IssueDto getById(Long id) {
    return null;
  }

  @Override
  public Page<IssueDto> getAllPageable(Pageable pageable) {
    return null;
  }

  @Override
  public Boolean delete(IssueDto issue) {
    return null;
  }
}
