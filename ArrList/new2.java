package ArrList;
import java.util.ArrayList;

public class new2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("AUDI");
        cars.add("BENZ");
        cars.add("SKODA");
        cars.add("VOLVO");
        cars.set(0, "kia");
        System.out.println(cars.get(0));
    }
}
