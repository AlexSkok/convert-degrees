package app;

import java.util.Scanner;

public class Main {

    public static double celciy;
    public static double farengeight;
    public static double CONV = 1.8;

    public static void main(String[] args){
        System.out.println("Start app converting degrees");

        System.out.println("Ввудіть градуси в Фаренгейтах: ");
        Scanner inputFar = new Scanner(System.in);
        farengeight = inputFar.nextDouble();
        toCelciy(farengeight);

        System.out.println("Ввудіть градуси в Цельсіях: ");
        Scanner inputCelciy = new Scanner(System.in);
        celciy = inputCelciy.nextDouble();
        toFrt(celciy);
    }

    public static void toCelciy(double frt){
        celciy = (frt - 32)/CONV;
        System.out.println("Ви ввели " + frt + " Фаренгейт" + " , в Цельсіях це буде " + celciy);
    }
    public static void toFrt(double cl){
        farengeight = cl*CONV + 32;
        System.out.println("Ви ввели " + cl + " Цельсій" + " , в Фаренгейтах це буде " + farengeight);
    }
}
