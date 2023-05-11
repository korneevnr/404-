package com.example.serverIntelliTestinh.repo;

import com.example.serverIntelliTestinh.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserRepo {
    void save(User user) throws IOException;
    User searchByLogin(String login) throws IOException;

    void update(User user, String login) throws IOException;
}
