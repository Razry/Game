package com.company;

public class Player {
    private String name;
    int score;


    public Player(String name) {
        this.name = name;
    }


    public void setScore(int score) {
        this.score=score;
    }

    public int getScore() {
        return this.score;
    }
    public String getName() {
       return name;
    }
    public void print() {
        System.out.println("Игрок " + name + " набрал " + score + " баллов");
    }

    @Override
    public String toString() {
        return name;

    }
    public void addScore(int score){
        this.score+=score;
    }
    public void Rez(){
        System.out.println("***************Таблица результатов*********************************************** ");
        System.out.println(name+": " + score);
    }
}
