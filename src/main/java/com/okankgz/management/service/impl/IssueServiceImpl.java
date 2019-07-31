package com.okankgz.management.service.impl;

import com.okankgz.management.entity.Issue;
import com.okankgz.management.repository.IssueRepository;
import com.okankgz.management.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;  //final ile o nesnenin runtimme değişmesini engellemiş olup nesneyi güvenli hale getirir.
    //final bir nesneye constructorda atayabilir.

    @Autowired  //bunu yazmasakta olur  spring bunu ınject ediyor
    public IssueServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    @Override
    public Issue getById(Long id) {
        return issueRepository.getOne(id);
    }

    @Override
    public Page<Issue> getAllPageable(Pageable pageable) {
        return issueRepository.findAll(pageable);
    }
}
