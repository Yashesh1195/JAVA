package com.example.first_javafx_project;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ListenersForObservableObjects {
    public static void main(String[] args) {
        IntegerProperty count = new SimpleIntegerProperty();

        count.addListener((Observable o) -> {
            System.out.println("New value is: " + count.intValue());
        });

        System.out.println(count.intValue());
        count.set(0);
        count.set(10);
        count.set(0);
    }
}
