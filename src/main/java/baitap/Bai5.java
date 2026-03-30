package baitap;

public class Bai5 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int a, int b) {
        for (int i = 1; i <= b;) {
            if (isPrime(++a)) {
                System.out.print(a + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        printPrime(15, 5);
    }
}
