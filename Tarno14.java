// 837799
public class Tarno14 {
    public static void main(String[] args) {
        long maxLength = 0;
        long number = 0;
        for (long i = 1; i < 1000000; i++) {
            long length = collatzLength(i);
            if (length > maxLength) {
                maxLength = length;
                number = i;
            }
        }
        System.out.println(number);
    }

    private static long collatzLength(long n) {
        long length = 1;
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            length++;
        }
        return length;
    }
}
