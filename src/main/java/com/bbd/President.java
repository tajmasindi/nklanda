package com.bbd;

import java.util.ArrayList;

public class President extends Politician {
    private ArrayList<Person> associates;

    public President(String n, int a, String g) {
        super(n, a, g);
        setType(Type.PRESIDENT);
        associates = new ArrayList<Person>();
    }

    public void addAssociate(Person p) {
        if (p != null) {
            associates.add(p);
        }
    }

    public ArrayList<Person> getAssociates(){
        return associates;
    }
}