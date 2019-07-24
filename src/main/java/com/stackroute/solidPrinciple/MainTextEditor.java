package com.stackroute.solidPrinciple;

import java.util.Scanner;

public class MainTextEditor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintText printText = new PrintText();
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        printText.setText(text);
        while (true) {

            System.out.println("\nHey! Choose your option\n 1.Make Uppercase the text\t" +
                    " 2.Delete particular substring\t " + "3.Print pr\t" + "4.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You choose to make uppercase");
                    printText.letterToUpperCase();
                    break;
                case 2:
                    System.out.println("You choose to delete a pr");
                    //System.out.println("Enter removable part");
                    String replacedPart = scanner.nextLine();
                    printText.findSubTextAndDelete(replacedPart);
                    break;
                case 3:
                    System.out.println("You choose to display a pr");
                    printText.print();
                    break;
                case 4:
                    System.out.println("You choose to exit");
                    System.exit(0);

            }
        }
//        else
//            System.out.println("Enter valid input");

    }
}
