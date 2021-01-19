package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n\tCONDITIONS:\n");
        conditionsTasks();

        System.out.println("\n\tLOOP (while):\n");
        loopWhileTasks();

        System.out.println("\n\tLOOP (for):\n");
        loopForTasks();
    }

    static void conditionsTasks(){
        Scanner nums = new Scanner(System.in);
        Scanner names = new Scanner(System.in);
        System.out.println("#1 Enter 2 numbers and I will return the MIN: ");
        //Scanner nums = new Scanner(System.in);
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        if (num1 > num2) {
            System.out.printf("\nMIN value is: %d", num2);
        } else {
            System.out.printf("\nMIN value is: %d", num1);
        }

        System.out.println("\n#2 Now enter 4 numbers and I will return the MAX: ");
        //Scanner nums = new Scanner(System.in);
        int[] numArray = new int[4];
        for (int i=0; i<numArray.length; i++){
            numArray[i] = nums.nextInt();
        }
        int max = numArray[0];
        for (int i=0; i<numArray.length; i++){
            if (max < numArray[i]){
                max = numArray[i];
            }

        }
        System.out.printf("\nMAX value is: %d", max);


        System.out.println("\n#3 Now enter 3 numbers and I will return them in descending order: ");
        //Scanner nums = new Scanner(System.in);
        int[] numArray2 = new int[3];
        for (int i=0; i<numArray2.length; i++){
            numArray2[i] = nums.nextInt();
        }
        for (int i=1; i<numArray2.length; i++){
            if (numArray2[i] > numArray2[i-1]){
                int tmp = numArray2[i];
                numArray2[i] = numArray2[i-1];
                numArray2[i-1] = tmp;
                i--;
                if (i>0) i--;
            }
        }
        for (int i=0; i<numArray2.length; i++){
            System.out.printf("%d ", numArray2[i]);
        }

        System.out.println("\n#4 Now enter 2 names and I will compare them: ");
        //Scanner names = new Scanner(System.in);
        String name1, name2;
        name1 = names.nextLine();
        name2 = names.nextLine();

        if (name1.equals(name2)){
            System.out.println("\nBoth names are the same\n");
        } else {
            if (name1.length() == name2.length()){
                System.out.println("\nNames have similar length\n");
            } else {
                System.out.println("\nNames are different and have different length\n");
            }
        }

        System.out.println("\n#5/6 Now enter your name: ");
        String name = names.nextLine();
        System.out.println("\nAnd enter your age: ");
        int age = nums.nextInt();
        if (age<18){
            System.out.println("\nПодрости еще");
        } else {
            if (age>20){
                System.out.println("\nИ 18-ти достаточно");
            } else {
                System.out.println("\nNot defined what to say for such age");
            }
        }

        System.out.println("\n#7 You have 7 tries to guess a number");
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        int i = 1;
        while (i <= 7){
            System.out.printf("\nGuess %d: ", i);
            int guess = nums.nextInt();
            if (guess == secret){
                System.out.println("\nУгадал :)");
                break;
            } else {
                if (guess < secret){
                    System.out.println(" Mало");
                } else {
                    System.out.println(" Mного");
                }
            }
            i++;
        }
        if (i==8) System.out.println("\nНе угадал :(");


        names.close();
        nums.close();
    }

    static void loopWhileTasks(){
        int i = 0;
        while (i<10){
            System.out.printf("%d ", ++i);
        }
        System.out.println("\n");
        while (i>0){
            System.out.printf("%d ", i--);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\n#10 Enter a line: ");
        String line = input.nextLine();
        System.out.println("\nHow many times return it?: ");
        i = input.nextInt();
        while (i > 0){
            System.out.println(line);
            i--;
        }
        System.out.println("\n#11 S Square\n");
        i = 0;
        while (i < 10){
            int j = 0;
            while (j < 10){
                System.out.print("S");
                j++;
            }
            System.out.print("\n");
            i++;
        }

        System.out.println("\n#12 TIMES TABLE \n");
        i = 0;
        while (i < 10){
            i++;
            int j = 0;
            while (j < 10){
                j++;
                System.out.printf("%3d ", i*j);
            }
            System.out.print("\n");
        }

        input.close();

    }

    static void loopForTasks() {

        System.out.println("\n#13 List of odds up to 100");
        for (int i = 2; i <= 100; i++){
            if (i%2 == 0) System.out.printf("%d ", i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\n#14 Let's draw rectangle with NxM size.\nEnter N: ");
        int n = input.nextInt();
        System.out.println("\nEnter M: ");
        int m = input.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print("8");
            System.out.println("\n");
        }

        System.out.println("\n#15 Let's draw triangle with 10x10 size.");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++) System.out.print("8");
            System.out.println("\n");
        }

        System.out.println("\n#16 Print vertical and horizontal lines.");
        for (int i=0; i<10; i++) System.out.print("8");
        for (int i=0; i<10; i++) System.out.print("\n8");

        Scanner input2 = new Scanner(System.in);
        System.out.println("\n#17 Type in name: ");
        String name = input2.nextLine();
        for (int i=0; i<10; i++) System.out.printf("\n%s любит меня", name);

        System.out.println("\n#18 Timer  before BUM!");
        for (int i=30; i>=0; i--){
            try {
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);

        }
        System.out.println("Бум!");









    }

}
