package ru.bagirov;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int clientOS = 1;
        if (clientOS >= 1 || clientOS < 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int clientDeviceYear = 2016;
        if (clientOS >= 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите новейшую версию приложениия");
            }
        }

        int yone = 4;
        int year = 2021;
        int ytwo = year / yone;
        if (ytwo < 507) {
            System.out.println("Не високосный год");
        }
        if (ytwo > 507) {
            System.out.println("Високосный год");
        }

        int DeliveryDistance = 95;
        if (DeliveryDistance < 100 && DeliveryDistance > 60) {
            System.out.println("Потребуется 3 дня");
        } else if (DeliveryDistance < 61 && 60 > 20) {
            System.out.println("Потребуется 2 дня");
        } else if (DeliveryDistance < 21 && 20 <= 20) {
            System.out.println("Потребуется 1 день");
        }


        int monthNumber=12;
        if (monthNumber == 1) {
            System.out.println("Зима");
        } else if (monthNumber == 2) {
            System.out.println("Зима");
        }else if (monthNumber == 3) {
            System.out.println("Весна");
        }else if(monthNumber== 4) {
            System.out.println("Весна");
        }else if (monthNumber == 5) {
            System.out.println("Весна");
        }else if (monthNumber == 6) {
            System.out.println("Лето");
        }else if (monthNumber == 7) {
            System.out.println("Лето");
        }else if (monthNumber == 8) {
            System.out.println("Лето");
        }else if (monthNumber == 9) {
            System.out.println("Осень");
        }else if (monthNumber == 10) {
            System.out.println("Осень");
        }else if (monthNumber == 11) {
            System.out.println("Осень");
        }else if (monthNumber == 12) {
            System.out.println("Зима");
        }else{
            if (monthNumber == 13);
            System.out.println("Не существует");



    }







    }
}
