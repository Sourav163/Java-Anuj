package Java_with_Anuj_Bhaiya.Package1;

public class MainInPackage1 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println(t.teachingClass);
//        System.out.println(t.id); --> can't be accessed due to it is defined as "private"
    }
}
