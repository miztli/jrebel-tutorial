package com.miztli.services;

import com.miztli.entities.UserEntity;

import java.util.List;

public interface IUserService
{
    void createDummyUsers();

    void clearUsers();

    List<UserEntity> getUsers();

    UserEntity getById(long id);

    void add(UserEntity user);
}
