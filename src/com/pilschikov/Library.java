package com.pilschikov;

import java.util.ArrayList;

public class Library {
    private String title;
    private int countOfPeople;
    private ArrayList<User> usersList;


    public int getCountOfPeople() {
        return countOfPeople;
    }
    public String getTitle() {
        return title;
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public Library(String title) {
        this.title = title;
        this.countOfPeople = 0;
        usersList = new ArrayList<User>();

    }

    public void addNewUser(String name, String surname, int age) {
        countOfPeople++;
        User newUser = new User(name, surname, age, countOfPeople );
        usersList.add(newUser);

    }



}
