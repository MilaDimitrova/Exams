package com.company;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < location; i++) {

            double avr = Double.parseDouble(scanner.nextLine());

            int days = Integer.parseInt(scanner.nextLine());

            double sum = 0.0;

            for (int j = 0; j < days; j++) {
                double extraction = Double.parseDouble(scanner.nextLine());
                sum += extraction;
            }
            double average = sum/days;
            if(average >= avr) {
                System.out.printf("Good job! Average gold per day: %.2f.\n",average);
            }else {
                System.out.printf("You need %.2f gold.\n", avr - average);
            }
        }
    }
}
