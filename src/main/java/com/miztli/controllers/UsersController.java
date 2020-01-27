package com.miztli.controllers;

import java.util.ArrayList;
import java.util.List;

import com.miztli.entities.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController
{
    private final List<UserEntity> users = new ArrayList<UserEntity>();

    @GetMapping
    public List<UserEntity> getUsers()
    {
        return users;
    }

    @PostMapping
    public void addUser(@RequestBody final UserEntity userEntity)
    {
        users.add(userEntity);
    }

    @GetMapping(value = "/{id}")
    public UserEntity getUserById(@PathVariable(name = "id") int id)
    {
        return users
            .stream()
            .filter(user -> user.getId() == id)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("User not found for given id: " + id));
    }
}
