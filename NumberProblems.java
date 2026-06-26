import java.util.Scanner;

public class Day03_NumberProblems {

    public static int reverseNumber(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int countDigits(int n) {
        if (n == 0) return 1;

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nResults:");
        System.out.println("Reverse Number : " + reverseNumber(num));
        System.out.println("Palindrome     : " + isPalindrome(num));
        System.out.println("Digit Count    : " + countDigits(num));
        System.out.println("Sum of Digits  : " + sumOfDigits(num));
        System.out.println("Armstrong      : " + isArmstrong(num));

        if (num >= 0 && num <= 20) {
            System.out.println("Factorial      : " + factorial(num));
        } else {
            System.out.println("Factorial      : Number should be between 0 and 20");
        }

        sc.close();
    }
}
