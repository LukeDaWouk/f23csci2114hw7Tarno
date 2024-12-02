// 104743
public class Tarno7 {
    public static void main(String[] args) {
        int count = 0, number = 1;
        while (count < 10001) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println(number);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
