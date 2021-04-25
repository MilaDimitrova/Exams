package com.company;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double avrHeight = Double.parseDouble(scan.nextLine());

        double capacity = width * lenght * height;
        double obem = (avrHeight + 0.4) * 2 * 2;

        double people = Math.floor(capacity / obem);

        if (people >= 3 && people <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts." , people);
        } else if (people < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (people > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
