package controllers;

import classes.user;

public interface iPersonController<T extends user> {
    void create(String firstName, String secondName, int age);
    
}
