package com.bbd;

public class Politician extends Person implements Visitor {

    public Politician(String n, int a, String g) {
        setAge(a);
        setGender(g);
        setName(n);
        setType(Type.POLITICIAN);
    }

    public void visit(HomeStead home) {
        if (getType().equals(Person.Type.POLITICIAN)) {
            throw new RuntimeException("You shall not pass!");
        }
    }
}