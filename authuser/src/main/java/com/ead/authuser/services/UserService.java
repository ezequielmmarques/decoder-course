package com.ead.authuser.services;

import com.ead.authuser.models.UserModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<UserModel> findAll();

    Optional<UserModel> findById(UUID usersId);

    void delete(UserModel userModel);

    void save(UserModel userModel);

    boolean existsByUsername(String userName);

    boolean existsByEmail(String email);
}
