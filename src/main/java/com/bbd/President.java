package com.bbd;

import java.util.ArrayList;

public class President extends Politician {
    private ArrayList<Person> associates;

    public President(String n, int a, String g, Politician.PoliticalParty p) {
        super(n, a, g, p);
        setType(Type.PRESIDENT);
        associates = new ArrayList<Person>();
    }

    public void addAssociate(Person p) {
        if (p != null) {
            associates.add(p);
        }
    }

    public ArrayList<Person> getAssociates() {
        return associates;
    }

    public boolean associateInArray(String name) {
        boolean result = false;

        for (int i = 0; i < associates.size(); i++) {
            if (associates.get(i).getName().equalsIgnoreCase(name)){
                result = true;
            }
        }

        return result;
    }

    public boolean associateInArray(Person.Type type) {
        boolean result = false;

        for (int i = 0; i < associates.size(); i++) {
            if (associates.get(i).getType().equals(type)){
                result = true;
            }
        }

        return result;
    }
}