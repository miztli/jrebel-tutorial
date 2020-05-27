package com.miztli.services;

import com.miztli.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService
{

    private final List<UserEntity> users = new ArrayList<>();

    @Override
    public void createDummyUsers()
    {
        users.clear();
        for (int i = 1; i <= 10; i++)
        {
            users.add(new UserEntity(i, "user " + i, i + 20, true));
        }
    }

    @Override
    public List<UserEntity> getUsers()
    {
        return users;
    }

    @Override
    public UserEntity getById(long id)
    {
        return users
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("User not found for given id: " + id));
    }

    @Override
    public void add(UserEntity user)
    {

        users.add(user);
    }
}
