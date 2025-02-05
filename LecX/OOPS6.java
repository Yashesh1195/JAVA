// //Static Keyword

// class Student {
//     String name;
//     static String school;
// }

// public class OOPS6 {
//     public static void main(String args[]) {
//         Student.school = "HEBRON";
//         Student stud1 = new Student();
//         stud1.name = "Yashesh";
//         System.out.println(stud1.name);
//         // System.out.println(stud1.school);
//     }
// }


// Static Keyword
class Student {
    String name;
    static String school;  // Static variable

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class OOPS6 {
    public static void main(String[] args) {
        Student.school = "HEBRON";  // Assign value to static variable
        Student stud1 = new Student();
        stud1.name = "Yashesh";
        
        System.out.println(stud1.name);
        System.out.println(stud1.school);  // Correct way to access static variable
    }
}
