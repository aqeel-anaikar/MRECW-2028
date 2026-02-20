class ZAlgorithm {

    static int[] buildZ(String s) {
        int n = s.length();
        int[] z = new int[n];

        int left = 0, right = 0;

        for (int i = 1; i < n; i++) {

            if (i > right) {
                left = right = i;

                while (right < n && s.charAt(right) == s.charAt(right - left)) {
                    right++;
                }

                z[i] = right - left;
                right--;
            } else {
                int k = i - left;

                if (z[k] < right - i + 1) {
                    z[i] = z[k];
                } else {
                    left = i;

                    while (right < n && s.charAt(right) == s.charAt(right - left)) {
                        right++;
                    }

                    z[i] = right - left;
                    right--;
                }
            }
        }
        return z;
    }

    static void search(String text, String pattern) {

        String combined = pattern + "$" + text;
        int[] z = buildZ(combined);

        for (int i = 0; i < z.length; i++) {
            if (z[i] == pattern.length()) {
                System.out.println("Pattern found at index " + (i - pattern.length() - 1));
            }
        }
    }

    public static void main(String[] args) {

        String text = "aabxaabxcaabxaabxay";
        String pattern = "aab";

        search(text, pattern);
    }
}

