package com.example.mostaf170.co_dublish.databaselogin;

/**
 * Created by mostaf170 on 23/11/2018.
 */

public class User {
    public String id;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}