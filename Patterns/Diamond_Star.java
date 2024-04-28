// Diamond Star Pattern
public class Diamond_Star {
    static void printpattern(int N){
        for(int i =0; i<N*2;i++){
            int col = i>N ? 2*N - i : i;
            int spaces = N - col ;

           for(int s =0;s<spaces; s++){    // for spaces
            System.out.print(" ");
            }
            for(int j = 0 ; j< col;j++){     
            System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         int N = 4;
         printpattern(N);

    }
}


// output 
//    * 
//   * * 
//  * * *
// * * * *
//  * * *
//   * *
//    *  
