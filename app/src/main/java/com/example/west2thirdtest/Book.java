package com.example.west2thirdtest;

import android.graphics.Color;

public class Book {
    private static boolean colorFlag=false;
    String name;
    int color;
    public Book(String name) {
        this.name = name;
        this.color = Color.parseColor(colorFlag?"#ffffff":"#dbedfd");
        colorFlag=!colorFlag;
    }

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
