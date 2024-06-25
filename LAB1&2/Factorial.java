

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        for(int i=1; i<=n; i++){
            mul *=i;
        }
        System.out.println("Factorial of the number is "+mul);
        sc.close();
    }
}