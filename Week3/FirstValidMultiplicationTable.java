public class FirstValidMultiplicationTable {
    static void generateFirstValidTable(int[] candidates) {
        for (int n : candidates) {
            if (n < 1) {
                System.out.println("Skipping invalid number: " + n);
                continue;
            }

            for (int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + (n * i));
            break;
        }
    }

    public static void main(String[] args) {
        generateFirstValidTable(new int[]{-3, 0, 7, 9});
    }
}
