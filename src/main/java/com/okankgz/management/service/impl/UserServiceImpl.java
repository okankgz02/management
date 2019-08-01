package com.okankgz.management.service.impl;

import com.okankgz.management.entity.User;
import com.okankgz.management.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }
}
