import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] results = new String[3];
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");

        for (int i = 0; i < 3; i++) {
            if (rand.nextBoolean()) {
                results[i] = "Heads";
                headsCount++;
            } else {
                results[i] = "Tails";
                tailsCount++;
            }
            System.out.println("Round " + (i + 1) + ": " + results[i]);
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}
