package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cat myCat = new Cat("Bin", "GiantTank", 100, 'M', "1234 First Street", true, 200.0);
        System.out.println("The name of my cat is: " + myCat.getPetName());

        Scanner input = new Scanner(System.in);
        System.out.println("Does this cat have whiskers?");
        myCat.setWhiskers(input.nextBoolean());
        System.out.println("Does this cat have whiskers? " + myCat.isWhiskers());

        myCat.setLegs(4);
        myCat.setFurColor("Black");

        System.out.println(myCat.makeSound());

        System.out.println(myCat.catYears());
    }
}
