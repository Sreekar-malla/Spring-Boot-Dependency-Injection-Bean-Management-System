package com.UserInterface.User;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class PostgreDatabase implements Database{
    public void save(String user){
        System.out.println("User is saved to PostgreSQL");
    }
}
