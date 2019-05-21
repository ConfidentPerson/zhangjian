package com.isoft1.service.impl;

import com.isoft1.dao.IUserDAO;
import com.isoft1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDAO userDAO;
    @Override
    public String login(String uname, String upwd) {
        String str=userDAO.login(uname,upwd);
        return str;
    }

    @Override
    public boolean register(String uname, String upwd, String email) {

        boolean temp=userDAO.register(uname,upwd,email);
        return temp;
    }
}
