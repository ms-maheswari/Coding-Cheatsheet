import java.util.*;
class SubsequenceChecker {
    static boolean isSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        return i == n;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        if (isSubsequence(s1, s2))
            System.out.println(s1 + " is a subsequence of " + s2);
        else
            System.out.println(s1 + " is not a subsequence of " + s2);

        scanner.close();
    }
}
