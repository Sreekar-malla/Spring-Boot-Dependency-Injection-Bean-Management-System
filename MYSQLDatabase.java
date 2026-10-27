package com.UserInterface.User;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
//@Primary
@Service
public class MYSQLDatabase implements Database{
    public void save(String user){
        System.out.println("Saving User to MYSQL DB");
    }
}
