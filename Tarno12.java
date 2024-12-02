// 76576500
public class Tarno12 {
    public static void main(String[] args) {
        int triangle = 0, i = 1;
        while (true) {
            triangle += i;
            if (countDivisors(triangle) > 500) {
                System.out.println(triangle);
                break;
            }
            i++;
        }
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                count += (i * i == number) ? 1 : 2;
            }
        }
        return count;
    }
}
