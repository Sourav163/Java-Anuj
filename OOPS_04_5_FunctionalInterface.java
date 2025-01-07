package Java_with_Anuj_Bhaiya;

public class OOPS_04_5_FunctionalInterface {
    public static void main(String[] args) {
        // lambda expression - can only be applied to functional interfaces.
        Walkable w = (int steps) -> {
            System.out.println("Walked " + steps + " Steps.");
            return steps;
        };

        Runnable r = (int distance) -> {
            System.out.println("Ran " + distance + " km.");
            return distance;
        };

        w.walk(2000);
        r.run(7);

        Walkable d = steps -> 0.00074 * steps;
        System.out.println("Walked " + d.walk(2000) + " km.");
    }
}

// functional interface - interface having only one method.
interface Walkable {
    double walk(int steps);
}


interface Runnable {
    int run(int distance);
}
