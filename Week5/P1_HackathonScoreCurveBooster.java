import java.util.Arrays;

class Main {
    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++)
            scores[i] += bonus;

        System.out.println(Arrays.toString(scores));
    }

    public static void main(String[] args) {
        curveScores(new int[]{70, 85, 60}, 10);
    }
}