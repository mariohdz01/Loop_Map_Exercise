package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class Dealership {

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, String> carInventory = new HashMap<>();

        carInventory.put("Toyota", "Corolla");
        carInventory.put("Dodge", "Charger");
        carInventory.put("Ford", "Mustang");
        carInventory.put("Chevrolet", "Camaro");
        carInventory.put("Audi", "A4");
        carInventory.put("Lexus", "LS");
        System.out.println("Welcome to the car dealership! I have multiple models to choose from!");
        System.out.println("Please type what vehicle you prefer.");

        String newString = scanner.nextLine();

        if (newString.equals("Toyota")) {
            System.out.println("Wonderful we have the Toyota Corolla in stock!");
        }
        else if (newString.equals("Dodge")) {
            System.out.println("Wonderful I have a Dodge Charger in stock!");
        }
        else if (newString.equals("Ford")) {
            System.out.println("Wonderful I have a Ford Mustang in stock!");
        }
        else if (newString.equals("Chevrolet")) {
            System.out.println("Wonderful I have a Chevy Camaro in stock!");
        }
        else if (newString.equals("Audi")) {
            System.out.println("Wonderful I have a Audi A4 in stock!");
        }
       else if (newString.equals("Lexus")) {
            System.out.println("Wonderful I have a Lexus LS in stock!");
        }
        else {
            System.out.println("I apologize I don't have that in stock. " +
                    "Please return later when our new shipment is in!");
        }

    }
}
