package org.example;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String name;
        String city;
        int age;
        String hobby;

        Scanner in = new Scanner(System.in);
        System.out.print("Say your name: ");
        name = in.nextLine();
        System.out.print("Write your hobby: ");
        hobby = in.nextLine();
        System.out.print("Where do you from? ");
        city = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();


        System.out.printf("Your name %s \n You are from %s \n Your age is: %d \n Your hobby is %s", name,  city,  age, hobby);

    }
}