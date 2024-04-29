public class Reverse_Number_Triangle {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) 
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
            System.out.println();
        }
    }

// Output

// 12345
// 1234
// 123
// 12
// 1
