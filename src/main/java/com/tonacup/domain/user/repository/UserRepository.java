package com.tonacup.domain.user.repository;

import com.tonacup.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(Long userId);

    Optional<User> findByEmail(String email);

    List<User> findByAll();
}
