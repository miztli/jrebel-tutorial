package com.miztli.entities;

public class UserEntity
{
    public UserEntity(int id, String name, int age, boolean active, String address)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.address = address;
    }

    private int id;

    private String name;

    private int age;

    private boolean active;

    private String address;

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

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
}
