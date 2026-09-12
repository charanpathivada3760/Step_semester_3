class Main {
    static int findMin(int[] a) {
        int l = 0, h = a.length - 1;

        while (l < h) {
            int m = (l + h) / 2;

            if (a[m] > a[h])
                l = m + 1;
            else
                h = m;
        }
        return a[l];
    }

    public static void main(String[] args) {
        System.out.println(findMin(
            new int[]{3, 4, 5, 1, 2}));
    }
}