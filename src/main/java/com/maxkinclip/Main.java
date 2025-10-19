package com.maxkinclip;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);

        double c = 23.3;

        System.out.println("1) применить несколько арифметических операций над int и double в одном выражении ");
        System.out.println(a+c);
        System.out.println(a-c);
        System.out.println(a*c);
        System.out.println(c/a);


        System.out.println("2) применить несколько логических операций ( < , >, >=, <= )");
        System.out.println(a < c);
        System.out.println(a > c);
        System.out.println(a >= a);
        System.out.println(c <= a);

        System.out.println("3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        System.out.println("4) получить переполнение при арифметической операции");
        System.out.println(Double.MAX_VALUE * 2);
        System.out.println(Double.MIN_VALUE / 2);
    }
}