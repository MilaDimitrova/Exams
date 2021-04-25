package com.company;

import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countBoxPaint = Integer.parseInt(scan.nextLine());
        int countTapets = Integer.parseInt(scan.nextLine());
        double rukavici = Double.parseDouble(scan.nextLine());
        double cetka = Double.parseDouble(scan.nextLine());

        double priceForPaint = 21.50 * countBoxPaint;
        double priceForTapets = 5.20 * countTapets;

        double countRukavici = Math.ceil(countTapets * 0.35);
        double countCetka = Math.floor(countBoxPaint * 0.48);

        double allPriceForRukavici = countRukavici * rukavici;
        double allPriceForCetka = countCetka * cetka;

        double allPrice =  priceForPaint + priceForTapets + allPriceForRukavici + allPriceForCetka;

        double forDelivery = allPrice / 15;

        System.out.printf("This delivery will cost %.2f lv." , forDelivery);
    }
}

