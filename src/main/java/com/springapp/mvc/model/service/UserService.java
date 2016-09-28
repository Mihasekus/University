package com.springapp.mvc.model.service;


import com.springapp.mvc.model.dao.UserDAO;
import com.springapp.mvc.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUser(String login, String password) {
        return userDAO.getUser(login, password);
    }
    public User getUserByStatus(String login, String password,String status) {
        return userDAO.getUserByStatus(login, password,status);
    }

    public void setUser(User user) {
        userDAO.setUser(user);
    }

    public void delUser(User user) {
        userDAO.delUser(user);
    }
}
