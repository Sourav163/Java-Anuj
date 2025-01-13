package Java_with_Anuj_Bhaiya;

public class Generics {
    public static void main(String[] args) {
        Obj1<String> obj1 = new Obj1<>("IS19104");
        System.out.println(obj1.getData());
        Obj1<Integer> obj2 = new Obj1<>(2102170);
        System.out.println(obj2.getData());

        Obj2<String, String> obj3 = new Obj2<>("IS19104", "Sourav Routray");
        obj3.getData();
        System.out.println("ID: " + obj3.getID() + ", Name: " + obj3.getName());
        Obj2<Integer, String> obj4 = new Obj2<>(2102170, "Sourav");
        obj4.getData();
        System.out.println("ID: " + obj4.getID() + ", Name: " + obj4.getName());

        // Generics Method
        printData("Hello World");
        printData(12345);

        Generics gm = new Generics();
        gm.displayData("Hello");
        gm.displayData(123);

        CustomClass custom = new CustomClass();
        printData(custom);
        gm.displayData(custom);

        gm.numberData(25);
//        gm.numberData("Hii"); --> won't be accepted.
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E> void displayData(E data) {
        System.out.println(data);
    }

    // Bounded Generics - Accepts only specific object type.
    <E extends Number> void numberData(E data) {
        System.out.println(data);
    }
}

class Obj1<Element> {
    private Element id;

    public Obj1(Element id) {
        this.id = id;
    }

    public Element getData() {
        return id;
    }
}

class Obj2<E, V> {
    private E id;
    private V name;

    public Obj2(E id, V name) {
        this.id = id;
        this.name = name;
    }

    public void getData() {
        System.out.println(id + " :  " + name);
    }

    public E getID() {
        return id;
    }

    public V getName() {
        return name;
    }
}

class CustomClass {

}