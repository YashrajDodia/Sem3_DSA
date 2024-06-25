import java.util.Scanner;
public class Insert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int element = sc.nextInt();
        boolean isDone = true;
        int[] arr = new int[n+1];
        int j = arr.length-2;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }
        while(isDone){
            if(j==-1){
                j=j+1;
                arr[j+1] = arr[j];
                arr[j] = element;
                break;
            }
            if(arr[j]>element){
                arr[j+1] = arr[j];
                j--;
            }else{
                arr[j+1] = element;
                isDone = false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
