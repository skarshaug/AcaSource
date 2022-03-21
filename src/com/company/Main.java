package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Available styles: (1) APA7th");
        System.out.println("Choose source style:");
        String selectedStyle = myObj.nextLine();
        apaSeventh a7 = new apaSeventh();


        if (selectedStyle.equals("1")) {
            a7.a7RUN();
        }
    }
}
