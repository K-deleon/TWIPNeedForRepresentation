package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner wordInput = new Scanner(System.in);
        System.out.println("Please type a word");
        String word = wordInput.next();

        char[] sortWord = word.toCharArray();
        int wordLength = sortWord.length;

        double startPercent = (Math.random());
        int startPos = (int)(startPercent * wordLength);
        System.out.println("First position is " + startPos);


        int corr = (int)(Math.random()*10);
        if (corr<=1){
            System.out.println("Start with binary, " + corr);
        } else if (corr <= 3) {
            System.out.println("Start with octal, " + corr);
        } else if (corr<=5){
            System.out.println("Start with decimal, " + corr);
        } else if (corr<=7){
            System.out.println("Start with hexadecimal, " + corr);
        } else if (corr <=9){
            System.out.println("Start with ASCII, " + corr);
        } else {
            System.out.print("Kiara something went wrong!, " + corr);
        }

        char startVal = sortWord[startPos];
        System.out.println(startVal);
        String val;

        for (int value = startPos; value <= wordLength; startPos++ ){
            System.out.println("We out here");
        }


    }
}
