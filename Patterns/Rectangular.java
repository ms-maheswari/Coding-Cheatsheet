// Pattern-1: Rectangular Star Pattern
class Rectangular {
static void pattern1(int N)
 {
     for (int i = 0; i < N; i++)
     {
         for (int j = 0; j < N; j++)
         {
             System.out.print("* ");
         }
         // for next row, give a line break
         System.out.println();
     }
 }
 
     public static void main(String[] args) {

         int N = 6;
         pattern1(N);
     }
 }

// Output:

// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
