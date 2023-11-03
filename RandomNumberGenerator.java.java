import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Random number generated: " + randomNumber);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Generates a random number between 1 and 10
}
}
