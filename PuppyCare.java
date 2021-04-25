package com.company;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kilograms = Integer.parseInt(scan.nextLine());

        int food = 0;

        String text = scan.nextLine();

        while (!text.equals("Adopted")) {
            int grams = Integer.parseInt(text);
            food += grams;

            text = scan.nextLine();
        }


        if (food <= kilograms * 1000) {
            int diff = kilograms * 1000 - food;
            System.out.printf("Food is enough! Leftovers: %d grams." , diff);
        } else {
            int diff = food - (kilograms * 1000);
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }

    }
}
