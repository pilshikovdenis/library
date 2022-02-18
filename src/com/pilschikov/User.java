package com.pilschikov;

public class User {
    private String name;
    private String surname;
    private int age;
    private int id;

//    name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

//  surname
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }

//  age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

//    id
    private void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public User(String name, String surname, int age, int id) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setId(id);

    }
}
