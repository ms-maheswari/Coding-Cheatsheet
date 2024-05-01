public class Hollow_Pattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0;i<n;i++){
         
            // inner loop for printing the stars at borders only.
            for(int j=0;j<n;j++){
                
                if(i==0 || j==0 || i==n-1 || j==n-1)
                   System.out.print("*");
                   
                // if not border index, print space.
                else 
                   System.out.print(" ");
            }
            
             System.out.println();
        }
    }
}


// OUTPUT

// *****
// *   *
// *   *
// *   *
// *****