package com.company;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double food = 0;


        for (int i = 1; i <= n; i++) {
            double foodForEat = Double.parseDouble(scanner.nextLine());

            if (foodForEat >= 100 && foodForEat < 200) {
                group1++;
            } else if (foodForEat >= 200 && foodForEat < 300) {
                group2++;
            } else if (foodForEat >= 300 && foodForEat < 400) {
                group3++;
            }
            food += foodForEat;
        }
        double foodPrice = (food / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.\n" , group1);
        System.out.printf("Group 2: %d cats.\n" , group2);
        System.out.printf("Group 3: %d cats.\n" , group3);


        System.out.print("Price for food per day: ");
        System.out.printf("%.2f", foodPrice);
        System.out.print(" lv.");


    }
}
