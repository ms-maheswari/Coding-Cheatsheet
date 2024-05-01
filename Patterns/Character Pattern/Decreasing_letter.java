// Decreasing Letter Triangle Pattern
public class Decreasing_letter {
    static void printpattern(int n) {
        for(int i=1;i<=n;i++){
            int p= 'A';
            for(int j=i;j<=n;j++){
                System.out.print((char)p++ +" ");
            }
            System.out.println();
        }

    }      
    
    public static void main(String[] args) {
        int n=4;
        printpattern(n);
    }
}



// A B C D 
// A B C
// A B
// A
