package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("\n TASK 1. return max of 20 elements\n");
        int[] array = new int[20];
        array = createArray();

        int x = max(array);
        System.out.printf("\n Maximum entered value was - %d%n", x);

        System.out.println("\n TASK 2. return 10 records in verse order");
        System.out.println("\n Please enter 8 lines\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        // enter 8 lines only
        for (int i = 0; i < 8; i++){
            list[i] = reader.readLine();
        }
        //print 10 elements in back order
        for (int i = list.length - 1; i >= 0; i--){
            System.out.println(list[i]);

        }

        System.out.println("\n TASK 3. Enter 10 lines and return 10 numbers equal to length of records \n");
        //String[] list = new String[10];
        int[] length = new int[10];
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++){
            list[i] = reader2.readLine();
            length[i] = list[i].length();
        }
        for (int i = 0; i < length.length; i++){
            System.out.printf("\n%d line  - %d", i + 1, length[i]);
        }


        System.out.println("\n TASK 4. Enter 10 numbers and they will be reordered and returned \n");
        int[] numbers = new int[10];
        Scanner readnum = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = readnum.nextInt();
        }
        // Change elements order
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = 0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n TASK 5. Enter 20 numbers they will be copied into 2x10 arrays and second one will be printed \n");
        int[] inputArray = new int[20];
        int[] firstArray  = new int[10];
        int[] secondArray = new int[10];
        Scanner readArray = new Scanner(System.in);
        for (int i=0; i< inputArray.length; i++){
            inputArray[i] = readArray.nextInt();
        }
        //Copy first 10 elements to firstArray and rest to secondArray
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = inputArray[i];
            secondArray[i] = inputArray[i+10];
        }
        // Print second array
        for (int j : secondArray) {
            System.out.println(j);
        }



    }

    static int[] createArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20];
        System.out.println("\nPlease enter 20 Integer values:\n");
        for (int i=0; i < arr.length; i++){
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }

        return arr;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
