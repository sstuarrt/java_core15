package com.company.java_core.homework15.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mapPerson = new HashMap<>();

        HashMap<String, String> mapPet = new HashMap<>();

        String num = sc.next();

        while(true) {
            menu();
            System.out.println("Enter number: ");
            switch (num) {
                case "1" -> {
                    System.out.println("Enter name and age of a new member: ");
                    mapPerson.put(sc.next(), sc.nextInt());
                }

                case "2" -> {
                    System.out.println("Enter type and name of the pet: ");
                    mapPet.put(sc.next(), sc.next());
                }

                case "3" -> {
                    System.out.println("Enter the name of pet to delete: ");
                    mapPet.remove(sc.next());
                }

                case "4" -> {
                    System.out.println("Enter the name of member to delete: ");
                    mapPerson.remove(sc.next());
                }

                case "5" -> {
                    System.out.println("Enter the type of animal to delete: ");
                    String type = sc.next();
                    if(type.equals(mapPet.values())) {
                        mapPet.remove(type);
                    }
                }

                case "6" -> {
                    System.out.println(mapPerson + "" + mapPet);
                }

                case "7" -> {
                    exit();
                }
            }
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void menu () {
        System.out.println(" ");
        System.out.println("1.Add a person to the club.");
        System.out.println("2.Add a new pet of club`s member.");
        System.out.println("3.Delete a pet of club`s member.");
        System.out.println("4.Delete the member of the club.");
        System.out.println("5.Delete all pets with the same type.");
        System.out.println("6.Show all members of the club.");
        System.out.println("7.Stop the program.");
    }
}
