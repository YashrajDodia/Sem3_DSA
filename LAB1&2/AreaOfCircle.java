
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI*(Math.pow(r, 2));
        System.out.println("Area of circle is : " + area);
        sc.close();
    }
}
