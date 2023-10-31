/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolproject.oopproject;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author emmanuel
 */
public class Menu {

    public int run() {
        Scanner scanner = new Scanner(System.in);
        BeeCatDogIdentifier bcdIdentifier = new BeeCatDogIdentifier();
        boolean exit = false;
        while (exit != true) {
            System.out.println("\n\nWelcome to the program");
            System.out.println(""
                    + "1. Cat-Dog-Bee Number \n"
                    + "2. Cat-Dog-Bee Range \n"
                    + "3. Prime Sum \n"
                    + "4. Prime Sum Range \n"
                    + "5. Exit \n");
            System.out.println("Pick Your Choice: ");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.print("Enter a number: ");                                        
                    int number = scanner.nextInt();
                    System.out.print("\n\n");
                    try {
                        System.out.println("Answer: " + bcdIdentifier.identify(number, true));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter start of range: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end of range: ");                    
                    int end = scanner.nextInt();
                    System.out.print("\n\n");
                    try {
                        Map<String, Integer> result = bcdIdentifier.identify(start, end);
                        System.out.printf(
                                "There are\n %d Dogs \n %d Cats \n %d Bees",
                                result.get("dog"),
                                result.get("cat"),
                                result.get("bee")
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    System.out.print("\n\n");
                    exit = true;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        scanner.close();
        return 0;
    }
}
