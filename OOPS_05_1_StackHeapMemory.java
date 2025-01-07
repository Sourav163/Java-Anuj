package Java_with_Anuj_Bhaiya;

// stack memory - contains all methods and variables.
// heap memory - contains all classes and objects.
public class OOPS_05_1_StackHeapMemory {
    public static void main(String[] args) {
        Data d = new Data();
        d.data = 5;
        System.out.println(d.data);
        change_data(d);
        System.out.println(d.data);
    }

    static void change_data(Data d) {
        d.data = 100;
    }
}

class Data {
    int data;
}