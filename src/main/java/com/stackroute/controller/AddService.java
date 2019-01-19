package com.stackroute.controller;

import com.stackroute.db.CrudOperation;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    User user =new User();
    public String message(User user)
    {

        String userName=user.getUserName();
        String password=user.getUserPass();
        CrudOperation crudOperation=new CrudOperation();
        crudOperation.insertCustomer(userName,password);
        return "Welcome "+user.getUserName()+" to stackroute";
    }
}
