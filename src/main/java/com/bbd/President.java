package com.bbd;

public class President extends Politician {

    public President(String n, int a, String g) {
        super(n, a, g);
        setType(Type.PRESIDENT);
    }
}