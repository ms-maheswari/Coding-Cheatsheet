class Square {
    static void pattern1(int N)
 {
     for (int i = 0; i < N; i++)
     {
         for (int j = 0; j < N; j++)
         {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
 
     public static void main(String[] args) {

         int N = 5;
         pattern1(N);
     }
 }
 
