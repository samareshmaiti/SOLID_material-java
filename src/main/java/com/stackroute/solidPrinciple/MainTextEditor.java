package com.stackroute.solidPrinciple;
import java.util.Scanner;
public class MainTextEditor {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        PrintText text=new PrintText();
        System.out.println("Enter your text");
        String text1=sc.nextLine();
        text.setText(text1);


        while(true){

            System.out.println("Hey! Choose your option\n 1.Make Uppercase the text\t" +
                    " 2.Delete particular substring\t "+"3.Print text\t"+"4.Enter any other key to Exit");
            int option=sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You choose to make uppercase");
                    text.letterToUpperCase();
                    break;
                case 2:
                    System.out.println("You choose to delete a text");
                    System.out.println("Enter replaced part");
                    String replacedPart = sc.nextLine();
                    text.findSubTextAndDelete(replacedPart);
                    break;
                case 3:
                    System.out.println("You choose to display a text");
                    text.print();
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
