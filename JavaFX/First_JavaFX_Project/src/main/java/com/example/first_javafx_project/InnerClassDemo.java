package com.example.first_javafx_project;

//class A {
//    public void displayA() {
//        System.out.println("Display Method of Class A!!");
//    }
//
//    class B {
//        public void displayB() {
//            System.out.println("Display Method of Class B!!");
//        }
//    }
//}
//
//public class InnerClassDemo {
//    public static void main(String[] args) {
//        A a = new A();
//        a.displayA();
//
//        A.B b1 = new A().new B();
//        b1.displayB();
//    }
//}

//Declaring Inner Class as Static - means we don't have to make object to call that class

class A {
    public void displayA() {
        System.out.println("Display Method of Class A!!");
    }

    static class B {
        public void displayB() {
            System.out.println("Display Method of Class B!!");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        A a = new A();
        a.displayA();

        A.B b1 = new A.B();
        b1.displayB();
    }
}