package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner wordInput = new Scanner(System.in);
        System.out.println("Please type a word");
        String word = wordInput.nextLine();


        String hexadecimal, octal, binary;
        int decimal;

        char[] sortWord = word.toCharArray();
        int wordLength = sortWord.length;

        double startPercent = (Math.random());
        int startPos = (int) (startPercent * wordLength);
        int nextPos = startPos;
        System.out.println("First position is " + startPos);

        int corr = (int)(Math.random() * 10);
 //       int getToZero = startPos;

   /*         while(startPos != 0){
                char nextVal = sortWord[nextPos];
                System.out.println("PLS WORK");

                if (corr % 10 == 0 || corr % 10 == 1) {
                    //binary
                    int binVal = (int)nextVal;
                    binary = Integer.toBinaryString(binVal);
                    System.out.println(binary + ", " + nextVal);
                    getToZero--;
                    nextPos--;
                    corr-=2;

                } else if (corr % 10 == 2 || corr % 10 == 3) {
                    //octal
                    int decVal = (int)nextVal;
                    octal = Integer.toOctalString(decVal);
                    System.out.println(octal + ", " + nextVal);
                    getToZero--;
                    nextPos--;
                    corr-=2;

                } else if (corr % 10 == 4 || corr % 10 == 5) {
                    //decimal
                    decimal = (int)nextVal;
                    System.out.println(decimal + ", " + nextVal);
                    getToZero--;
                    nextPos--;
                    corr-=2;

                } else if (corr % 10 == 6 || corr % 10 == 7) {
                    //hexadecimal
                    hexadecimal = Integer.toHexString((int) nextVal);
                    System.out.println(hexadecimal + ", " + nextVal);
                    getToZero--;
                    nextPos--;
                    corr-=2;

                } else if (corr % 10 == 8 || corr % 10 == 9) {
                    //ascii
                    System.out.println(nextVal);
                    getToZero--;
                    nextPos--;
                    corr-=2;

                }

            }

*/

        for (int charVal = startPos; charVal < wordLength; corr+=2) {

            char startVal = sortWord[startPos];
            char nextVal = sortWord[nextPos];

            if (corr % 10 == 0 || corr % 10 == 1) {
                //binary
                int binVal = (int)nextVal;
                binary = Integer.toBinaryString(binVal);
                charVal++;
                System.out.println(binary);
                nextPos++;

            } else if (corr % 10 == 2 || corr % 10 == 3) {
                //octal
                int octVal = (int)nextVal;
                octal = Integer.toOctalString(octVal);
                System.out.println(octal);
                charVal++;
                nextPos++;
            } else if (corr % 10 == 4 || corr % 10 == 5) {
                //decimal
                decimal = (int)nextVal;
                System.out.println(decimal);
                charVal++;
                nextPos++;
            } else if (corr % 10 == 6 || corr % 10 == 7) {
                //hexadecimal
                hexadecimal = Integer.toHexString((int) nextVal);
                System.out.println(hexadecimal);
                charVal++;
                nextPos++;
            } else if (corr % 10 == 8 || corr % 10 == 9) {
                //ascii
                System.out.println(nextVal);
                charVal++;
                nextPos++;
            }

        }
    }
 }
