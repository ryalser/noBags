package practice_10;

public class Task_18 {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
