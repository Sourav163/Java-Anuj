package Java_with_Anuj_Bhaiya;

import java.util.ArrayList;

class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal: Name = " + name + ", Age = " + age + ", Weight = " + weight + "\n";
    }
}

public class ComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal("Oggy", 14, 25);
        Animal a2 = new Animal("Olly", 12, 20);
        Animal a3 = new Animal("Jack", 20, 30);
        Animal a4 = new Animal("Bob", 27, 50);

        ArrayList<Animal> al = new ArrayList<>();
    }
}
