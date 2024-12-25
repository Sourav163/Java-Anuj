package Java_with_Anuj_Bhaiya.Package1;

// Access Modifiers :
// public - Yes: Same Class
//          Yes: Same Package Subclass
//          Yes: Same Package Non-Subclass
//          Yes: Different Package Subclass
//          Yes: Different Package Non-Subclass
// private - Yes: Same Class
//           No: Same Package Subclass
//           No: Same Package Non-Subclass
//           No: Different Package Subclass
//           No: Different Package Non-Subclass
// default - Yes: Same Class
//           Yes: Same Package Subclass
//           Yes: Same Package Non-Subclass
//           No: Different Package Subclass
//           No: Different Package Non-Subclass
// protected - Yes: Same Class
//             Yes: Same Package Subclass
//             Yes: Same Package Non-Subclass
//             Yes: Different Package Subclass
//             No: Different Package Non-Subclass

import Java_with_Anuj_Bhaiya.Package2.MainInPackage2;

// Same Class :
public class Teacher {
    public int teachingClass = 12;
    private int id = 104;
    String degree = "M.A. in English"; // default or, package-private
    protected int studentsCount = 64;

    public static void main(String[] args) {
        System.out.println("Teacher :");
        Teacher t = new Teacher();
        System.out.println("\t" + t.teachingClass);
        System.out.println("\t" + t.id);
        System.out.println("\t" + t.degree);
        System.out.println("\t" + t.studentsCount);
    }
}