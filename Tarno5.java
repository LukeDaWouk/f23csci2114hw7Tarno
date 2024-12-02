// 232792560
public class Tarno5 {
    public static void main(String[] args) {
        int number = 20;
        while (true) {
            if (isDivisible(number)) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }

    private static boolean isDivisible(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
