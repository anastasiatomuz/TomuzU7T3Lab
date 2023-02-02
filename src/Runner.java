import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String args[]){
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0, 1);
        ints.add(0, 2);
        ints.add(0, 3);
        ints.add(0, 4);
        ints.add(0, 5);
        ints.add(0, 6);

        ArrayList<Integer> newInts = new ArrayList<Integer>();

        for (int i = ints.size() - 1; i >= 0; i--) {
            newInts.add(ints.get(i));
        }

        System.out.println(ints);
        System.out.println(newInts);

        int ran = Integer.parseInt("123");
        System.out.println(ran + 1);
    }
}


