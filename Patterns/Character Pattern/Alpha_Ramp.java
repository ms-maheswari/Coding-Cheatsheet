// Alpha-Ramp Pattern
public class Alpha_Ramp {
static void printpattern(int N)
     {
           for(int i=0;i<N;i++){
               
              for(int j=0;j<=i;j++){
                   // same char which is defined 
                   // is to be printed i times in that row.
                   System.out.print((char)((int)('A'+i)) + " "); 
               }
               System.out.println();
              }
     }
     
         public static void main(String[] args) {
             int N = 5;
             printpattern(N);
         }
     }
     
    //  A 
    //  B B 
    //  C C C 
    //  D D D D 
    //  E E E E E 
