package com.miztli.entities;

public class UserEntity
{
    private int id;

    private String name;

    private int age;

    private boolean active;

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(final boolean active)
    {
        this.active = active;
    }
}
