import java.util.*;

class Combinations {

    static void generate(int n, int k, int start, List<Integer> current) {

        if (current.size() == k) {
            System.out.println(current);
            return;
        }

        for (int i = start; i <= n; i++) {

            current.add(i);

            generate(n, k, i + 1, current);

            // backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int n = 4;
        int k = 2;

        generate(n, k, 1, new ArrayList<>());
    }
}
