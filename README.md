package com.company;

import java.util.Scanner;

public class Game {
    private static Player winPlayer;

    public static void main(String[] args) {

        System.out.print("Введите количество игроков: ");
        byte count = new Scanner(System.in).nextByte(); //Введите кол-во игроков
        Player[] players = new Player[count];
        for (int i = 0; i < players.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: "); //Введите имя i+1  игрока
            String name = new Scanner(System.in).nextLine();
            players[i] = new Player(name);        //Не смог написать, что бы вывести имена игроков, выводит путь к их имени но не само имя
        }
        System.out.println("Началась игра");    //НАчалась игра
        System.out.println("Введите максимальное число очков для победы: ");
        int winScore = new Scanner(System.in).nextInt();
        int maxScore = 1;
        int lastRoundindex = 0;
        int round = 1;

        while (true) {
            System.out.println("Раунд " + round++);
            for (int i = 0; i < players.length; i++) {
                System.out.println("Бросает " + (i + 1) + " игрок: " + players[i]);
                int score = (int) (1 + Math.random() * 6);
                players[i].addScore(score);//Функция
                players[i].print();
                if (maxScore < score) {
                    maxScore = score;
                    lastRoundindex = i;
                }
                if (players[i].getScore() >= winScore) {
                    winPlayer = players[i];
                }
            }

            sdvig(players, lastRoundindex);
            System.out.println("В этом раунде выиграл игрок: " + players[lastRoundindex]);
            if (winPlayer != null) {
                System.out.println(" ");
                System.out.println("Победитель игры: " + winPlayer);
                System.out.println("Игра закончилась");

                break;
            }
        }
    }

    public static void sdvig(Player[] players, int i) {
        for (int j = 0; j < (i + 1); j++) {
            Player buf = players[j+1];
            players[j + 1] = players[i];
            players[i] = buf;

        }
        players[0] = players[i];
    }

}
