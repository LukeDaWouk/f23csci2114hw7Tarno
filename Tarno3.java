// 6857
public class Tarno3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long factor = 2;

        while (factor * factor <= number) {
            if (number % factor == 0) {
                number /= factor;
            } else {
                factor++;
            }
        }
        System.out.println(number);
    }
}
