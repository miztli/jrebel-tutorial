package com.miztli.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingsController
{
    @GetMapping
    public Map<String, String> greetings(@RequestParam(name = "name", defaultValue = "unknown") final String name)
    {
        return Map.of("greetings changed", name);
    }
}
