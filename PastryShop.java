package com.company;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sweet = scan.nextLine();
        int orderedSweets = Integer.parseInt(scan.nextLine());
        int dayOfDecember = Integer.parseInt(scan.nextLine());

        double cakeBeforeOr15  = 24;
        double souffleBeforeOr15 = 6.66;
        double baklavaBeforeOr15 = 12.60;
        double cakeAfter15 = 28.70;
        double souffleAfter15 = 9.80;
        double baklavaAfter15 = 16.98;

        if (sweet.equals("Cake")) {
            double sumSweetBeforeOr15 = orderedSweets * cakeBeforeOr15;
            if (sumSweetBeforeOr15 >= 100 && sumSweetBeforeOr15 <= 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.15;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 > 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.25;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 < 100 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.1;
                double newSum = sumSweetBeforeOr15 - discount;
                System.out.printf("%.2f",newSum);
            }

            double sumAfter15 = orderedSweets * cakeAfter15;
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.15;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 > 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.25;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 > 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }

        }


        if (sweet.equals("Souffle")){
            double sumSweetBeforeOr15 = orderedSweets * souffleBeforeOr15;
            if (sumSweetBeforeOr15 >= 100 && sumSweetBeforeOr15 <= 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.15;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 > 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.25;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 < 100 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.1;
                double newSum = sumSweetBeforeOr15 - discount;
                System.out.printf("%.2f",newSum);
            }


            double sumAfter15 = orderedSweets * souffleAfter15;
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.15;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 > 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.25;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 > 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 > 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }

        }
        if (sweet.equals("Baklava")){
            double sumSweetBeforeOr15 = orderedSweets * baklavaBeforeOr15;
            if (sumSweetBeforeOr15 >= 100 && sumSweetBeforeOr15 <= 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.15;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 > 200 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.25;
                double newSum = sumSweetBeforeOr15 - discount;
                double discount1 = newSum * 0.1;
                double newSum1 = newSum - discount1;
                System.out.printf("%.2f",newSum1);
            }
            if (sumSweetBeforeOr15 < 100 && dayOfDecember <= 15){
                double discount = sumSweetBeforeOr15 * 0.1;
                double newSum = sumSweetBeforeOr15 - discount;
                System.out.printf("%.2f",newSum);
            }


            double sumAfter15 = orderedSweets * baklavaAfter15;
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.15;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 > 200 && dayOfDecember > 15 && dayOfDecember <= 22){
                double discount = sumAfter15 * 0.25;
                double newSum = sumAfter15 - discount;
                System.out.printf("%.2f",newSum);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 > 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 15 && dayOfDecember <= 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 < 100 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 >= 100 && sumAfter15 <= 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
            if (sumAfter15 > 200 && dayOfDecember > 22){
                System.out.printf("%.2f",sumAfter15);
            }
        }
    }
}
