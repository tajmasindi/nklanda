package com.bbd;

public class Politician extends Person{
    
    public Politician(String n, int a, String g, Type t){
        setAge(a);
        setGender(g);
        setName(n);
        setType(t);
    }
}