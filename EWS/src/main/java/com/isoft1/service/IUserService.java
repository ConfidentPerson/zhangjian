package com.isoft1.service;

public interface IUserService {
    String login(String uname,String upwd);
    boolean register(String uname,String upwd,String email);

}
