package com.stackroute.solidPrinciple;

public class Text {
    String text;
    String author;
    int length;


    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", length=" + length +
                '}';
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
