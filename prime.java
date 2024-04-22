public class prime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimesUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        int N = 20; // Modify N to the desired value
        System.out.println("Prime numbers up to " + N + ":");
        printPrimesUpToN(N);
    }
}
