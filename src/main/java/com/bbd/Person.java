package com.bbd;

public class Person implements Visitor {
    enum Type {
        PRESIDENT, LAWYER, ARCHITECT, POLITICIAN
    }

    private String name;
    private int age;
    private String gender;
    private Type personType;

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

    public void visit(HomeStead home) {
        if (getType().equals(Person.Type.POLITICIAN)) {
            throw new RuntimeException("You shall not pass!");
        }
    }
}