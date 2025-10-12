package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

    static void main() {

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(56);
        list.add(45);
        list.add(67);
        list.add(89);
        System.out.print(list);
        System.out.println(list.contains(56));
        list.set(1, 89);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
