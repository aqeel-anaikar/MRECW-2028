import java.util.*;

class Subsets {

    static void generate(int[] arr, int index, List<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include element
        current.add(arr[index]);
        generate(arr, index + 1, current);

        // Backtrack (remove last element)
        current.remove(current.size() - 1);

        // Exclude element
        generate(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        generate(arr, 0, new ArrayList<>());
    }
}
