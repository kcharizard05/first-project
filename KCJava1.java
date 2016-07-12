package com.kcjava1;

public class KCJava1 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("My name is Karishma and this is my first java program");

        //simple printing
        System.out.println("Hello Srikumar!\nHello Divya and\nHello Karishma Chari");

        //working with variables
        //floating point numbers (decimals)
        float money = (float) 100.01;
        System.out.println("The value of money is: " + money);

        //character arrays or string (but NOT the String class)
        char[] testString = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(testString);

        //allocate an character of 100 characters
        char[] char100 = new char[100];

        //let's work with whole numbers
        int firstInt = 10;
        int[] firstIntArray = {2, 0, 5};
        System.out.println("My first integer: " + firstInt);

        //use a loop and print my first array
        System.out.println("My first array: ");
        System.out.println(firstIntArray[0] + "," + firstIntArray[1] + "," + firstIntArray[2]);
        for (int i = 0; i < 3; i++)
            System.out.println(firstIntArray[i]);

        //let's play with some characters
        char car = 't';
        char school = 'g';
        System.out.println(car + school);
        System.out.println(school);
        System.out.printf("Numeric value is %f and %f but the character value is %c and %c\n", (float) car, (float) school, car, school);

        //comparison operators
        int dog = 7;

        if (dog == 7) {
            System.out.print("Your dog is so young");
        } else if (dog == 23) {
            System.out.print("You've had your dog for a long time");
        } else if (dog == 4) {
            System.out.print("Wow your dog is still very young!");
        } else {
            System.out.print("Your dog is cute regardless of its age!");
        }
        int child = 5;

        if (child <= 11) {
            System.out.print("Your child is in elementary school!");
        } else if (child == 14) {
            System.out.print("Your child schould be in eighth grade!");
        } else if (child == 19) {
            System.out.print("Your child must be a freshmen in college!");
        } else {
            System.out.print("I hope your child is still learning!");
        }
    }
}
