package com.bbd;

public class Person {
    enum Type {
        PRESIDENT, LAWYER, ARCHITECT, POLITICIAN
    }

    String name;
    int age;
    String gender;
    Type personType;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String g) {
        gender = g;
    }

    public Type getType() {
        return personType;
    }

    public void setType(Type t) {
        personType = t;
    }
}