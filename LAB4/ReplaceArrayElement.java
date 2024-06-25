import java.util.Scanner;
public class ReplaceArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pos1 = 0;
        int pos2 = 0;
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==a){
                pos1 = i;
            }if(arr[i]==b){
                pos2 = i;
            }
        }
        int temp = arr[pos2];
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
        
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("postion of 1st element is "+ (pos2+1));
        System.out.println("postion of 2nd element is "+ (pos1+1));
        sc.close();
    }
}
