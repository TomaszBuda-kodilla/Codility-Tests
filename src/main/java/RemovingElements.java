import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 6, 7, 9, 8};
        System.out.println(returnValidSortedArray(array));
        int[] array2 = {1, 2, 4, 3, 5, 7, 8, 6, 9, 10};
        System.out.println(returnValidSortedArray(array2));

    }
    private static List<Integer> returnValidSortedArray(int[] array) {
        List<Integer> result = new ArrayList<>();
        result.add(array[0]);

        Arrays.stream(array).forEach(number -> {
            if (!result.contains(number) && result.get(result.size() - 1) < number) {
                result.add(number);
            }
        });
        return result;
    }
}
