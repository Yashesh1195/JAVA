class Pen{
    String color;
    String type; //ballpoint or gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void color() {
        System.out.println("Color : " + this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Parametrized and Non-Parametrized Constructor
    Student() {
        // System.out.println("Constructor called!");
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Student(Student s2) {
        // System.out.println("Constructor called!");
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "red";
        // pen2.type = "ballpoint";

        // // pen1.write();
        // pen1.color();

        // pen2.color();

        Student s1 = new Student();
        s1.name = "Yashesh";
        s1.age = 26;

        Student s2 = new Student(s1);
        // s2.name = "Vanshal";
        // s2.age = 20;

        s2.printInfo();

    }

}