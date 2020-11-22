package com.company;

public class ListElement {
    public ListElement next;
    public int element;

    public ListElement getNext() {
        return next;
    }
    public int getElement() {
        return element;
    }
    @Override
    public String toString() {
        return "ListElement{" +
                "next=" + next +
                ", element=" + element +
                '}';
    }
}
