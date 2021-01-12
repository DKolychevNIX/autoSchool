package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Task 2.3
        Scanner in = new Scanner(System.in);
        /*System.out.print("\nPlease enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        practice1(num1, num2);
        System.out.print("\nPlease enter 2 digit number: ");
        int num = in.nextInt();
        practice2(num);
        System.out.print("\n Enter decimal number: ");
        float a = in.nextFloat();
        practice3(a);

         */
        System.out.print("Enter 3 numbers (a, b, c): ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        practice4(a, b, c);



        in.close();
    }

    static void practice1(int num1, int num2){
        // вывести результат деления 2х чисел с остатком
        int a = num1 / num2;
        int b = num1 % num2;
        System.out.printf("Dividing result: %d, the rest: %d", a, b);
    }

    static void practice2(int num){
        // вывести на экран сумму цифр двузначного числа
        int a = num / 10;
        int b = num % 10;
        int c = a + b;
        System.out.printf("%d + %d = %d", a, b, c);
    }

    static void practice3(float a){
        // 0кругляем число
        float a10 = a * 10;
        int b = (int) a10;
        int num = b / 10;
        int result = num;
        int rest = b % 10;
        if (rest > 4){
            result++;
        }
        System.out.printf("integer: %d, rest: %d, final: %d", num, rest, result);
    }

    static void practice4(int a, int b, int c) {
        // a=a+b b=c-a c=a+b+c
        int origb = b;
        int origc = c;
        c = a + b + c;
        b = origc - a;
        a = a + origb;
        System.out.printf("a=%d, b=%d, c=%d", a, b, c);
    }
}
