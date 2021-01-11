package com.welcome;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = in.nextLine();
        in.close();

        Hello Hi = new Hello();
        Hi.setupName(name);
        Hi.welcome();
        System.out.println("\nHello, World!");
        Hi.byeBoy();

    }
}

class Hello {

    private String name;

    public void setupName(String name){
        this.name = name;
    }

    public void welcome(){
        System.out.printf("Hello, %s", this.name);
    }

    public void byeBoy(){
        System.out.printf("Bye, %s", this.name);
    }
}
