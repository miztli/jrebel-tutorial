package com.miztli.services;

import com.miztli.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService
{

    private final List<UserEntity> users = new ArrayList<>();

    private int userId = 1;

    @Override
    public void createDummyUsers()
    {
        for (int i = 1; i <= 3; i++)
        {
            users.add(new UserEntity(userId, "user " + userId, userId + 20, true, "Some address for " + userId));
            userId++;
        }
    }

    @Override
    public void clearUsers()
    {
        users.clear();
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
