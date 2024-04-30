// Star Pyramid
public class Star_Pyramid {
    static void printpattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j=i;j<=n;j++){       //Decreasing space
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");  //Increasing star
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");  //Increasing star
            }
            System.out.println();  
        }
    }
    public static void main(String[] args){
        int n = 5;
        printpattern(n);
} 
}


  //         * 
  //       * * *
  //     * * * * *
  //   * * * * * * *
  // * * * * * * * * *
