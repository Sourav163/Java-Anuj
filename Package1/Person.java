package Java_with_Anuj_Bhaiya.Package1;

public class Person {
    private int age;

    boolean canBeModified = true;

    public void setAge(int age) {
        if (canBeModified) { // Authorization
            if (age > 0) // Validation
                this.age = age;
            else System.out.println("Invalid age");
        } else System.out.println("Can't Modify Now");
    }

    boolean canBeAccessed = true;

    public int getAge() {
        if (canBeAccessed) return age;
        else return -1;
    }
}
