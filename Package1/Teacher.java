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

public class Teacher {
    public int teachingClass;
    private int id;

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.teachingClass = 5;
        t.id = 0;
    }
}
