//Polymorphism :- Method Overloading

class Student1 {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " : " + age);
    }

}

public class OOPS2 {
    public static void main(String args[]) {
        
        Student1 s1 = new Student1();
        s1.name = "Yashesh";
        s1.age = 26;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);

    }
}
