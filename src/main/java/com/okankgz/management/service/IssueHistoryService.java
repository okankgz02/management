package com.okankgz.management.service;


import com.okankgz.management.entity.Issue;
import com.okankgz.management.entity.IssueHistory;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);
    IssueHistory getById(Long id);
    Page<IssueHistory> getAllPageable(Pageable pageable);
    Boolean delete(Issue issue);


}
