class Main {
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0, mismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                matched++;
            else if (mismatch == -1)
                mismatch = i;
        }

        double accuracy = matched * 100.0 / original.length();

        if (mismatch == -1)
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches",
                    matched, original.length(), accuracy);
        else
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d",
                    matched, original.length(), accuracy, mismatch + 1);
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
}