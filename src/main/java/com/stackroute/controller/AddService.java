package com.stackroute.controller;

public class AddService {
    User user =new User();
    public String message(User user)
    {
        return "Welcome "+user.getUserName()+" to stackroute";
    }
}
