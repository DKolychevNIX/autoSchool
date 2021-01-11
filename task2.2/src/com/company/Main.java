package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printHelloName();
    }

    static void printHelloName() {
        Scanner in = new Scanner(System.in);
        System.out.print("your name: ");
        String name = in.nextLine();
        in.close();

        System.out.printf("Hello, %s", name);
    }
}