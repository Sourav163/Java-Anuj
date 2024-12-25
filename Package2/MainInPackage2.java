package Java_with_Anuj_Bhaiya.Package2;

import Java_with_Anuj_Bhaiya.Package1.Teacher;

public class MainInPackage2 {
    public static void main(String[] args) {
        DifferentPackageSubTeacher dpst = new DifferentPackageSubTeacher();
        dpst.print();

        DifferentPackageTeacher dpt = new DifferentPackageTeacher();
        dpt.print();
    }
}

// Different Package Subclass
class DifferentPackageSubTeacher extends Teacher {
    void print() {
        System.out.println("DifferentPackageSubTeacher :");
        System.out.println("\t" + teachingClass);
//        System.out.println(id);
//        System.out.println("\t" + degree); --> can't be accessed outside of package due to it is defined as "default"
        System.out.println("\t" + studentsCount);
    }
}

// Different Package Non-Subclass
class DifferentPackageTeacher {
    void print() {
        System.out.println("DifferentPackageTeacher :");
        Teacher t = new Teacher();
        System.out.println("\t" + t.teachingClass);
//        System.out.println(t.id);
//        System.out.println("\t" + t.degree);
//        System.out.println("\t" + t.studentsCount); --> can't be accessed outside of package without extending due to it is defined as "protected"
    }
}