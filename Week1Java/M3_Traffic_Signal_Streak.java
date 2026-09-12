class Main {
    static void findLongestStreak(String log) {
        if (log.length() == 0) return;

        char longest = log.charAt(0), current = log.charAt(0);
        int max = 1, count = 1;

        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == current)
                count++;
            else {
                current = log.charAt(i);
                count = 1;
            }

            if (count > max) {
                max = count;
                longest = current;
            }
        }

        System.out.println("Longest Streak: '" + longest +
                "' repeated " + max + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}