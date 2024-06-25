import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            sum2=sum2+sum;
        }
        System.out.println(sum2);
        sc.close();
    }
}