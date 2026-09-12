import java.util.Arrays;

class Main {
    static int[] productExceptSelf(int[] a) {
        int[] r = new int[a.length];
        int p = 1;

        for (int i = 0; i < a.length; i++) {
            r[i] = p;
            p *= a[i];
        }

        p = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            r[i] *= p;
            p *= a[i];
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}