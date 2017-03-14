package com.bbd;

public class Lawyer extends Person{
    public Lawyer(String n, int a, String g){
        setAge(a);
        setGender(g);
        setName(n);
        setType(Type.LAWYER);
    }
}