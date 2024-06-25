import java.util.*;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        int[] newArray = new int[n-1];

        for(int i=0; i<n; i++){
            if(i<pos){
                newArray[i] = arr[i];
            }
        }
        for(int i=pos; i<n-1; i++){
            newArray[i] = arr[i+1];
        }

        for(int i=0; i<n-1; i++){
            System.out.println(newArray[i]);
        }
    }
}
