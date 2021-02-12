package ru.samsung.itschool.mdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        while(true) {
            // выход обязательно
        }

        do {

        } while( true);

        int[] a = new int[10]; // лучше
        double b[] = new double[4];

        int z = 100;
        String zz = Integer.toString(z);
        String bbb = "500";
        int mm = Integer.parseInt(bbb);

        int p = 60;
        double o = 9.5;
        o = p; //60.0
        long j = 7;
        p = (int)j; // явное приведение

        // / - целочисленное %-остаток от деления

        // Math.pow(2.0,2.0)





        for(int i: a) System.out.print(i + " ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        String word = scanner.next(); // до пробела



        // простые типы данных
        // int, byte, long, short
        // float, double
        // char
        // boolean

        int a;
        a = 6;

        // Объекты
        // String
        // Integer, Float, Double
        // Char, Boolean
        // ....

        String str = "Test";
        str = "Hello";
        String abc = new String("dddd");

        if(a == 100) a++;
        if(a > 100) {

        } else if(a < 10) {

        } else {

        }

        String a1 = "Moscow";
        String a2 = "Moscow";

        System.out.println(a1 == a2);

        String a3 = new String("Test");
        String a4 = new String("Test");

        System.out.println(a3 == a4);
        System.out.println(a1.equals(a2));


        for(int i=0; i<10; i++) {
            System.out.println(i);
        }


        Car bmw = new Car("Bmw",500);
        Tesla tesla = new Tesla();
        Tesla tesla_p = new Tesla("Tesla",1000,200);


    }
}

