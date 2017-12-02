package com.chenlaoda.cake.user.service;

import java.util.List;

import com.chenlaoda.cake.entity.User;

public interface UserService {
    public User getUser(int id);
    public User getUser(String nameOrEmail);
    public void addUser(User user);
    public boolean deleteUser(int id);
    public boolean updateUser(User user);
    public List<User> getAllUser();
}