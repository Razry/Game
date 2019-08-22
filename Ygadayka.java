package com.company;

import java.util.Scanner;

public class Ygadayka {

    public static void main(String[] args) {
        Player[] array;
        boolean ega = false;
        System.out.print("Введите количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        array = new Player[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите имя игрока: " + (i + 1) + " ");
            String name = scanner.next();
            array[i] = new Player(name);
        }
        System.out.println("Началась игра: ");
        System.out.println("Попробуйте угадать число от 1 до 100: ");
        byte random = (byte) (1 * Math.random()  * 10);
        System.out.println(random);
        int rount = 1;
        boolean isGuessed=true;
        while (isGuessed) {
            System.out.println("Раунд: " + rount++);
            for (int i = 0; i < array.length; i++) {
                System.out.println("Угадывает " + (i + 1) + " игрок " + array[i]);
                byte ygadal = scanner.nextByte();
                if (ygadal == random) {
                    System.out.println("Победил игрок " + array[i]);
                    isGuessed=false;
                    break;
                }
                }
            System.out.println("Игроки должны попробовать еще раз");
            }

        }
    }



