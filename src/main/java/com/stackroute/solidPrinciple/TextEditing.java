package com.stackroute.solidPrinciple;

class TextEditing extends Text{

    public void letterToUpperCase() {
        System.out.print("Making uppercase to your text\t");

        System.out.println(text.toUpperCase());


    }
    void findSubTextAndDelete(String textString)
    {
        System.out.print("Deleting your substring in the text:\t");
        System.out.println(text.replaceAll(text," "));
    }
}
