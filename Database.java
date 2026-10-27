package com.UserInterface.User;

import org.springframework.stereotype.Repository;

@Repository
public interface Database {
    void save(String user);
}
