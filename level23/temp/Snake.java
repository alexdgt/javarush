package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;


/**
 *
 */
public class Snake
{
    private ArrayList<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y){
        sections = new ArrayList<SnakeSection>();
        SnakeSection section = new SnakeSection(x,y);
        sections.add(section);
        isAlive = true;
    }
    public int getX(){

        SnakeSection section = sections.get(0);
        return section.getX();
    }

    public int getY(){
        SnakeSection section = sections.get(0);
        return section.getY();
    }

    public void move(){

    }

    public ArrayList<SnakeSection> getSections()
    {
        return sections;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public SnakeDirection getDirection()
    {
        return direction;
    }

    public void setDirection(SnakeDirection direction)
    {
        this.direction = direction;
    }
}
