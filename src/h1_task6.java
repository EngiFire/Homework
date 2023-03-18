import java.util.Scanner;

public class h1_task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        while (n != 0) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("Final sum: " + sum);
    }
}