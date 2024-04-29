// Increasing Number Triangle Pattern
public class IncreasingNumber_Tri {
    static void printpattern(int n) {
        
        int p=1;
        for(int i=1; i<=n;i++){
            for(int j=1;j <= i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }      
    
    public static void main(String[] args) {
        int n=4;
        printpattern(n);
    }
}



// 1 
// 2 3
// 4 5 6
// 7 8 9 10
