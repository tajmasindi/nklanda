package com.bbd;

public class Politician extends Person {

    public Politician(String n, int a, String g) {
        setAge(a);
        setGender(g);
        setName(n);
        setType(Type.POLITICIAN);
    }
}