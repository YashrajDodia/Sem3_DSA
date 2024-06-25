import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = 1;
        for(int i = 1 ; i <= y ; i++){
            product*=x;
        }
        System.out.println(product);
        sc.close();
    }
}
