package com.example.serverIntelliTestinh.servive.impl;

import com.example.serverIntelliTestinh.model.User;
import com.example.serverIntelliTestinh.repo.UserRepo;
import com.example.serverIntelliTestinh.repo.repoImpl.UserRepoImpl;
import com.example.serverIntelliTestinh.servive.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Value("${upload.path}")
    private String uploadPath;

    @Override
    public void addUser(User newUser) throws IOException {
        UserRepo repo =new UserRepoImpl();
        String iconName = newUser.getLogin();
        //File Icon = new File("resources\\etc\\" + iconName + ".sys");
        //Icon.createNewFile();
        //FileOutputStream fout = new FileOutputStream(Icon);
        //fout.write(newIcon.getBytes());
        //fout.close();
        repo.save(newUser);
    }

    @Override
    public User login(String login, String password) throws IOException {
        UserRepo repo = new UserRepoImpl();
        if(repo.searchByLogin(login)!=null){
            User user = repo.searchByLogin(login);
            if(Objects.equals(user.getPassword(), password)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(User user, String login) throws IOException {
        UserRepo repo = new UserRepoImpl();
        repo.update(user, login);
    }
}
