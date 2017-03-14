package com.bbd;

public class Architect extends Person{
    
    public Architect(String n, int a, String g){
        setAge(a);
        setGender(g);
        setName(n);
        setType(Type.ARCHITECT);
    }
}