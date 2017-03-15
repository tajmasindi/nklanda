package com.bbd;

public class Politician extends Person {

    enum PoliticalParty {
        DA, ANC, EFF;
    }

    private PoliticalParty politicalParty;

    public Politician(String n, int a, String g, PoliticalParty p) {
        setAge(a);
        setGender(g);
        setName(n);
        setType(Type.POLITICIAN);
        setPoliticalParty(p);
    }

    public void setPoliticalParty(PoliticalParty p) {
        politicalParty = p;
    }

    public PoliticalParty getPoliticalParty() {
        return politicalParty;
    }
}