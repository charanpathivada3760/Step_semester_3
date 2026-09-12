class Main {
    static void analyzeInventory(int[] a, int[] b) {
        int totalA = 0, totalB = 0;
        int highest = a[0], index = 0;
        String section = "Section A";

        for (int i = 0; i < a.length; i++) {
            totalA += a[i];
            totalB += b[i];

            if (a[i] > highest) {
                highest = a[i];
                index = i;
                section = "Section A";
            }

            if (b[i] > highest) {
                highest = b[i];
                index = i;
                section = "Section B";
            }
        }

        String status = totalA == totalB ? "Balanced" : "Not Balanced";

        System.out.printf("Section A Total: %d | Section B Total: %d | " +
                "Status: %s | Highest Quantity: %d (%s, Item %d)",
                totalA, totalB, status, highest, section, index + 1);
    }

    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};
        analyzeInventory(a, b);
    }
}