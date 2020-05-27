package com.miztli.controllers;

import com.miztli.entities.UserEntity;
import com.miztli.services.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController
{
    @Resource
    private IUserService iUserService;

    @GetMapping
    public List<UserEntity> getUsers()
    {
        return iUserService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody final UserEntity userEntity)
    {
        iUserService.add(userEntity);
    }

    @GetMapping(value = "/{id}")
    public UserEntity getUserById(@PathVariable(name = "id") int id)
    {
        return iUserService.getById(id);
    }

    @PostMapping(value = "/dummy")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDummies()
    {
        iUserService.createDummyUsers();
    }
}
