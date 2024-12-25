package Java_with_Anuj_Bhaiya.Package1;

public class MainInPackage1 {
    public static void main(String[] args) {
        SamePackageSubTeacher spst = new SamePackageSubTeacher();
        spst.print();

        SamePackageTeacher spt = new SamePackageTeacher();
        spt.print();
    }
}

// Same Package Subclass
class SamePackageSubTeacher extends Teacher {
    void print() {
        System.out.println("SamePackageSubTeacher :");
        System.out.println("\t" + teachingClass);
//        System.out.println(id); --> can't be accessed due to it is defined as "private"
        System.out.println("\t" + degree);
        System.out.println("\t" + studentsCount);
    }
}

// Same Package Non-Subclass
class SamePackageTeacher {
    void print() {
        System.out.println("SamePackageTeacher :");
        Teacher t = new Teacher();
        System.out.println("\t" + t.teachingClass);
//        System.out.println(t.id);
        System.out.println("\t" + t.degree);
        System.out.println("\t" + t.studentsCount);
    }
}