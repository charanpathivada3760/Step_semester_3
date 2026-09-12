import java.util.*;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int score) {
        return cgpa >= 6.5 && score >= 60;
    }

    double total() {
        return cgpa * 10 + codingScore / 2.0;
    }

    public int compareTo(Candidate other) {
        return Double.compare(other.total(), total());
    }
}

class Main {
    static String shortlistAndRank(Candidate[] a) {
        ArrayList<Candidate> list = new ArrayList<>();

        for (Candidate c : a)
            if (Candidate.isEligible(c.cgpa) ||
                Candidate.isEligible(c.cgpa, c.codingScore))
                list.add(c);

        Collections.sort(list);

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += (i + 1) + ". " + list.get(i).name +
                      " (" + list.get(i).total() + ")";
            if (i < list.size() - 1) result += " | ";
        }
        return result;
    }

    public static void main(String[] args) {
        Candidate[] a = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(a));
    }
}