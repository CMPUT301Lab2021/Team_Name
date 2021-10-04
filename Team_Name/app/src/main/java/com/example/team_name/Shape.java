package com.example.team_name;

public class Shape  {
    Integer x;
    Integer y;
    private String Color;

    Shape(Integer x, Integer y, String Color){
        this.x = x;
        this.y = y;
        this.Color=Color;
    }
    public void setColor(String Color){this.Color="blue";}
}

