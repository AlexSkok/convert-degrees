package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Start app converting degrees");

        double celciy;
        double farengeight;
        double CONV = 1.8;

        System.out.println("Ввудіть градуси в Фаренгейтах: ");
        Scanner inputFar = new Scanner(System.in);
        farengeight = inputFar.nextDouble();
        celciy = (farengeight - 32)/CONV;
        System.out.println("Ви ввели " + farengeight + " Фаренгейт" + " , в Цельсіях це буде " + celciy);
    }
}
