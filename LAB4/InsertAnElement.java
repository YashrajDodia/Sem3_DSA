import java.util.Scanner;
public class InsertAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n  = sc.nextInt();
        System.out.println("Enter position of array : ");
        int position = sc.nextInt();
        System.out.println("Enter the element you want to insert : ");  
        int element = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<arr.length-1 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = arr.length-2; j>=position-1 ; j--){
            if(j==position-1){
                arr[j+1] = arr[j];
                arr[j] = element;
            }else{
                arr[j+1] = arr[j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    } 
}
