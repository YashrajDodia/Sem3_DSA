import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int flag=0;
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                
                if(arr[i]==arr[j]){
                    flag++;
                    System.out.println("Contains a duplicate");
                    break;
                }
            }
    
        }
        if(flag==0){
            System.out.println("Doesn't contain a duplicate number");
        }
    }
}
