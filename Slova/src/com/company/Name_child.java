
//Программа выводит рандомные имена из списка который мы ввели
//Программа для того, что бы определить как назвать малыша, если вы не можете определиться
package com.company;

import java.util.Scanner;

public class Name_child {

    public static void main(String[] args) {
        System.out.print("Введите количество мужских имен желаемые для выбора:  ");

            byte count1 = new Scanner(System.in).nextByte();
            Vvodimye_slova[] slova = new Vvodimye_slova[count1];
            for (int i = 0; i < slova.length; i++) {
                System.out.println("Введите " + (i + 1) + " имя ");
                String name = new Scanner(System.in).nextLine();
                slova[i] = new Vvodimye_slova(name);
            }

        System.out.print("Введите количество женских имен желаемые для выбора:  ");
            byte count2 = new Scanner(System.in).nextByte();
            Vvodimye_slova[] slova1 = new Vvodimye_slova[count2];
            for (int i = 0; i < slova1.length; i++) {
                System.out.println("Введите " + (i + 1) + " имя ");
                String name = new Scanner(System.in).nextLine();
                slova1[i] = new Vvodimye_slova(name);
        }
        while (true){

            int rand1 = (int) (Math.random()*count1);
            int rand2 = (int) (Math.random()*count2);

            String phrase =" Мужское имя: "+ slova[rand1] + " Женское имя: " + slova1[rand2];
            System.out.println(phrase);
            break;

        }
    }
}
