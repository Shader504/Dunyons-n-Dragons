import java.util.Random;

public class dados {
    public static int d20() {
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        return n;
    }
    public static int d6() {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        return n;
    }
    public static int d8() {
        Random rand = new Random();
        int n = rand.nextInt(8) + 1;
        return n;
    }
}
