package com.jwt.jwtExample.service;

import com.jwt.jwtExample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Siddhant","siddhant@abc.com"));
        store.add(new User(UUID.randomUUID().toString(),"Deepesh","deepesh@abc.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul","rahul@abc.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rohit","rohit@abc.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
