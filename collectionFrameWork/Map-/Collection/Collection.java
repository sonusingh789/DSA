import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(60);
        list.add(8);

        System.out.println(Collections.min(list));

    }

}
