import java.util.Scanner;
class Solution {
    boolean isPrime = true;
    int count = 0;
    public int countPrimes(int n) {
       if(n==0||n==1){
         count = 0;
       }else{
         for(int i = 2 ; i < n ; i++){
            for(int j = 2 ; j <= i/2 ; j++){
                if(i%j==0){
                   isPrime = false; 
                   break;
                }
            }
            if(isPrime){
                count++;
                // System.out.print(i + " ");
            }else{
                isPrime = true;
            }
         }
       }
       return count; 
    }
}

public class CountPrimes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s1 = new Solution();
        int ans = s1.countPrimes(n);
        System.out.println(ans);
        sc.close();
    }
}