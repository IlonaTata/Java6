package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
       int number= service.rangeLimits(200, 300);
        System.out.println(number);
    }
}
