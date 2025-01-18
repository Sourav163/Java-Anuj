package Java_with_Anuj_Bhaiya;

import java.util.*;

class Employee {
    int ID;
    String name;

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SetImplementation {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>(); // O(1) uses hash for each element.
//        Set<Integer> set = new LinkedHashSet<>(); // O(n) uses LinkedList implementation.
        Set<Integer> set = new TreeSet<>(); // O(log(n)) uses sorting algorithm.
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);
        set.add(40);
        set.add(40);

        System.out.println("set = " + set);
        System.out.println("set.remove(20) = " + set.remove(20));
        System.out.println("set = " + set);
        System.out.println("set.contains(50) = " + set.contains(50));
        System.out.println();

        Set<String> friends = new HashSet<>();
        friends.add("Sourav");
        friends.add("Akash");
        friends.add("Akash");
        friends.add("Abhaya");
        System.out.println("friends = " + friends);
        System.out.println();

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(170, "Sourav"));
        employees.add(new Employee(170, "Sourav"));
        employees.add(new Employee(170, "Sourav"));
        employees.add(new Employee(172, "Srinibash"));
        employees.add(new Employee(172, "Srinibash"));
        System.out.println("employees = " + employees);
        System.out.println();

        System.out.println(Color.RED);
        EnumSet<Color> enum_set = EnumSet.allOf(Color.class);
    }

    enum Color { // only following colors are allowed
        RED, GREEN, BLUE
    }
}
