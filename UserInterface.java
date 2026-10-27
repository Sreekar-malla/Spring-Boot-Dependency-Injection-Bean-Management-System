package com.UserInterface.User;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class UserInterface {
//    @Qualifier("MYSQLDatabase")
    UserInterface( Database db){
        this.db = db;
    }
    Database db;
    public void saveto(String user){
        System.out.println("Saving "+user+" to UserInterface");
        db.save(user);
    }
}
