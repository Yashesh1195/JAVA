package com.example.first_javafx_project;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PropertyBinding {
    public static void main(String[] args) {
        IntegerProperty a = new SimpleIntegerProperty(10);
        IntegerProperty b = new SimpleIntegerProperty(20);

//        a.bind(b);
        b.bind(a);

        System.out.println(a.getValue());
        System.out.println(b.getValue());

//        b.setValue(35);
        a.setValue(35);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
    }
}
