class Main {
    static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortCount = 0, mediumCount = 0, longCount = 0;

        for (String word : words) {
            int n = word.length();

            if (n <= 4)
                shortCount++;
            else if (n <= 8)
                mediumCount++;
            else
                longCount++;
        }

        System.out.println("Short: " + shortCount +
                " | Medium: " + mediumCount +
                " | Long: " + longCount);
    }

    public static void main(String[] args) {
        classifyWordLengths(
            "This movie was absolutely fantastic and thrilling");
    }
}