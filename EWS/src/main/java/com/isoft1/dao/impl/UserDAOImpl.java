package com.isoft1.dao.impl;

import com.isoft1.dao.IUserDAO;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
    @Override
    public String login(String uname, String upwd) {
        System.out.println(uname+","+upwd);
        return "success";
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        System.out.println(email);
        return true;
    }
}
