// Leke Obayemi
// Exercise 7
// 3/5/22


package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String name;
    static String email;
    static Long phoneNumber;

    public static void main(String[] args) {
        prompt();       //Prompt questions
        Contact contactInfo = new Contact(name, email);
        contactInfo.display();
        Business businessInfo = new Business(name, email, phoneNumber);
        businessInfo.display();

    }

    public static void prompt() {
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter email");
        email = input.nextLine();
        System.out.println("Enter phone number");
        phoneNumber = input.nextLong();
    }
}
