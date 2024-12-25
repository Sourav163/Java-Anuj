package Java_with_Anuj_Bhaiya.Package2;

import Java_with_Anuj_Bhaiya.Package1.Person;

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
//        p.age = 18;
//        System.out.println(p.age); --> Can't be done like this bcz of data hiding

        p.setAge(21);
        System.out.println(p.getAge());
    }
}
