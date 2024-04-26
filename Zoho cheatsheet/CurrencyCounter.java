public class CurrencyCounter {
    
    public static void countCurrency(int totalAmount) {

        int[] denominations = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] denominationCounts = new int[9];
      
    
        for (int i = 0; i < 9; i++) {
            if (totalAmount >= denominations[i]) {
                denominationCounts[i] = totalAmount / denominations[i];
                totalAmount = totalAmount % denominations[i]; // remaining amount update here 
            }
        }
      
        
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (denominationCounts[i] != 0) {
                System.out.println(denominations[i] + " : " + denominationCounts[i]);
            }
        }
    }
     
    
    public static void main(String[] args) {
        int totalAmount = 5610; // Total amount
        countCurrency(totalAmount); 
    }
}
