public class GuessTheNumber {
    static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tries = 0;
        boolean guessed = false;

        while (tries < maxTries && tries < guesses.length) {
            int guess = guesses[tries];

            if (guess > secretNumber) {
                System.out.println("Too high");
            } else if (guess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            }
            tries++;
        }

        if (!guessed)
            System.out.println("Out of tries — the number was " + secretNumber);
    }

    public static void main(String[] args) {
        guessTheNumber(42, 4, new int[]{20, 60, 42});
    }
}
