public class Half_Diamond {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    
    for (int i = 1; i < n; i++) {
        for (int j = n; j > i; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

// Output

// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *