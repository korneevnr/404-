package com.example.serverIntelliTestinh.servive;

import com.example.serverIntelliTestinh.model.User;

import java.io.IOException;

public interface UserService {

    void addUser(User newUser) throws IOException;

    User login(String login, String password) throws IOException;

    void update(User user, String login) throws IOException;
}
