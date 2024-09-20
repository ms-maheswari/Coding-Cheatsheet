package Arrays;

public class Sec_large {
    
    static int large(int[] arr,int n){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
         if(arr[i]>max){
            max=arr[i];
         }
       }
       return max;
    }
    static int sec_large(int[] arr,int largest,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          if(arr[i]>max && arr[i]!=largest){
             max=arr[i];
          }
        }
        return max;
    }
    public static void main(String[] args) {
       int[] arr ={1,45,67,88,89,34,22,33,54,6,43,42,41};
       int n=arr.length;
       int largest = large(arr, n);
       int seclarge= sec_large(arr, largest, n);
       System.out.println(largest);
       System.out.println(seclarge);
    }
}


