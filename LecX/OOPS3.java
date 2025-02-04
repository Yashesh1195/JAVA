//Inheritance

// // Base/Parent Class
// class Shape {
//     String color;
// }

// // Sub/Child Class
// class Triangle extends Shape {

// }

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

//Multi-Level Inheritance
// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1/2*l*h);
//     }
// }

//Hierarchical Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class OOPS3 {
    public static void main(String args[]) {
        


    }
}
