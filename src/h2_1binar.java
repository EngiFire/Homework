import java.util.Scanner;

public class h2_1binar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Result: ");
        while (n != 0) {
            System.out.print( n % 2);
            n /= 2;
        }
    }
}