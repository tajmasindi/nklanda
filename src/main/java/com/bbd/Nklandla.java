package com.bbd;

public class Nklandla extends HomeStead {
    SwimmingPool swimmingPool;
    ChickenRun chickenRun;
    Amphitheatre amphitheatre;

    public Nklandla(String n, String d, String p, String c) {
        super(n, d, p, c);
    }

    public void setSwimmingPool(SwimmingPool p) {
        swimmingPool = p;
    }

    public void setChickenRun(ChickenRun c) {
        chickenRun = c;
    }

    public void setAmphitheatre(Amphitheatre a) {
        amphitheatre = a;
    }

    public boolean valid() {
        return (swimmingPool != null) && (chickenRun != null) && (amphitheatre != null);
    }
}