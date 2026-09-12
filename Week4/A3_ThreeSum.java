import java.util.*;

class Main {
    static List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> r = new ArrayList<>();

        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            int l = i + 1, h = a.length - 1;

            while (l < h) {
                int sum = a[i] + a[l] + a[h];

                if (sum == 0) {
                    r.add(Arrays.asList(a[i], a[l], a[h]));
                    while (l < h && a[l] == a[l + 1]) l++;
                    while (l < h && a[h] == a[h - 1]) h--;
                    l++;
                    h--;
                } else if (sum < 0) l++;
                else h--;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(
            new int[]{-1, 0, 1, 2, -1, -4}));
    }
}