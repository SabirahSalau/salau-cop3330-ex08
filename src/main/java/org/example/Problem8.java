/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;

import java.util.Scanner;

public class Problem8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");
        int people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        int totalSlices = slices * pizzas;
        int eachGets = totalSlices / people;
        int remainder = totalSlices % people;

        System.out.println(people + " people with " + pizzas + " pizzas " + "(" + totalSlices + " slices)");
        System.out.println("Each person gets " + eachGets + " pieces of pizza.");
        System.out.println("There are " + remainder + " leftover pieces.");
    }
}
