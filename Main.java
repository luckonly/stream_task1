package streams_task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,8,3,2,6,7,-8,0,7,9,5,2,55,890,33,4,-2);
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i ++) {
            int x = list.get(i);
            if (x > 0 && x % 2 == 0) {
                newList.add(x);
            }
        }

        newList.sort(Comparator.naturalOrder());

        for (int i = 0; i < newList.size(); i ++) {
            System.out.println(newList.get(i));
        }

    }
}
