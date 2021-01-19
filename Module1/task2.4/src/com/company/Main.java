package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("\nTASK 1.");
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a line: ");
        String line = in.nextLine();
        // Крайние и средний символы
        int length = line.length();
        String start = line.substring(0, 1);
        String end = line.substring(length-1, length);
        if (length > 2){
            int middle = length / 2;
            if (length%2 == 0){
                middle--;
            }
            String middchar = line.substring(middle, middle+1);
            System.out.printf("\nLine starts with %s, middle char is %s, ends with %s", start, middchar, end);
        } else {
            System.out.printf("\nLine is 2 chars only: starts with %s and ends with %s", start, end);
        }

        // Подсчитываем кол-во пробелов
        int space_cnt = 0;
        String restOfLine = line;
        int pos;
        do {
            length = restOfLine.length();
            pos = restOfLine.indexOf(' ');
            if (pos > -1){
                space_cnt++;
                restOfLine = restOfLine.substring(pos+1, length);
            }
        } while (pos > -1);
        System.out.printf("\nProvided line contains %d white spaces.", space_cnt);
        // выводим первое предложение
        pos = line.indexOf('.');
        if (pos > 0){
            String sentence = line.substring(0, pos+1);
            System.out.println("First sentence is:\n" + sentence);
        } else {
            System.out.println("Provided line doesn't include any dots");
        }


        System.out.println("\nTASK 2.");
        System.out.println("Enter a line and strings to be substituted and one to substitute to");
        System.out.println("Please enter a line: ");
        line = in.nextLine();
        System.out.println("Please enter substring for substitution: ");
        String substrToChange = in.nextLine();
        System.out.println("Please enter a substring it should be replaced by: ");
        String substrChangeTo = in.nextLine();
        System.out.println("The result line is:");
        System.out.print(line.replace(substrToChange, substrChangeTo));

        System.out.println("\nTASK 3.");
        System.out.println("Enter a sequence of words separated by whitespaces: ");
        line = in.nextLine();
        String[] words = line.split(" ");
        int maxLength = words[0].length();
        String maxWord = words[0];
        pos = words.length;
        for (int i=1; i<pos; i++){
            if (words[i].length() > maxLength ){
                maxLength = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.printf("\nWord %s is longest, consist of %d chars.", maxWord, maxLength);




        in.close();

    }
}
