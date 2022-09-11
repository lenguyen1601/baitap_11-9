import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListToArray {
    public static void main(String[] args) {
        // Create list
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Convert ArrayList to Array
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        // Print data
        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40]
    }
}
