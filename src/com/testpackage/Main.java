package com.testpackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int Number = in.nextInt();
        while (Number <= 0) {
            System.out.print("Число должно быть положительным и не равным 0.Введите число для проверки: ");
            Number = in.nextInt();
        }
        int index=0;
        for (int i=1;i<Number;i++) {
            if(Number%i==0) {
                index+=i;
            }
            }
        if (Number == index ) {
            System.out.print("Число является совершенным.");
        } else {
            System.out.print("Число не является совершенным.");
        }

    }
}
