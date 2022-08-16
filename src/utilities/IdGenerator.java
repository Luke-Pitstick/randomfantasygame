package utilities;
import java.util.Random;

public class IdGenerator {
    private static final Random random = new Random();

    public static int generateId() {
        return random.nextInt(999999);
    }
}
