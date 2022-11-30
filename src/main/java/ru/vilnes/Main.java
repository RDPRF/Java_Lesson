package ru.vilnes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Присвоение значений
        byte varByte = 10;
        short varShort = 20000;
        int varInt = 300000;
        long varLong = 4000000000L;
        float varFloat = 1.0f;
        double varDouble = 60.22d;
        //Математические действия
            System.out.println("Математические действия:");
            System.out.println("Умножение значения varByte на значение varInt");
            System.out.println(varByte*varInt);
            System.out.println("Вычитание значения varShort из значения varLong");
            System.out.println(varLong-varShort);
            System.out.println("Деление значения varDouble на значения varFloat");
            System.out.println(varDouble/varFloat);
        // Переполнение
            System.out.println ("Переполнение:");
            System.out.println ("Byte");
            System.out.println(varByte+1000);
            System.out.println ("Short");
            System.out.println(varShort+100000);
            System.out.println ("Long");
            System.out.println(varLong+1000000000);
        // Логические операторы
            System.out.println ("Работа с логическими операторами:");
            int a = 1;
            if (a>0){
                System.out.println("переменная а больше 0");
            }
            int b = 100;
            if (b==100){
                System.out.println("переменная b равна 100");
            short c = 36;
            if (c>=(a+9)){
                System.out.println("переменная c больше или равна результату сложения 1+9");
            }
            }
    }
}
