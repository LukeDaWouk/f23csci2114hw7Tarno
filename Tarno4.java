// 906609
public class Tarno4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
