// Inverted Right Pyramid
public class pattern5 {
    static void Inverted_Right(int N) {
         for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 6;
        printPattern(N);
    }
}


// Output:

// * * * * * *
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
