package com.stackroute.solidPrinciple;

import java.util.Scanner;

class TextEditing extends Text {
    Scanner scanner = new Scanner((System.in));

    public void letterToUpperCase() {
        System.out.print("Making uppercase to your text\t");

        System.out.println(text.toUpperCase());


    }

    void findSubTextAndDelete(String textString) {

        System.out.print("Deleting your substring in the text:\t");
        //System.out.println("Enter removable part");
        textString = scanner.nextLine();
        System.out.println(text.replaceAll(textString, ""));
    }
}
