import java.util.Scanner;

public class h1_task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        int n = sc.nextInt();
        System.out.println("Enter integers:");
        int sum = 1;
        int i = 0;
        while (sum < n) {
            i += 1;
            sum *= sc.nextInt();
        }
        System.out.print("Result: " + i + " " + sum );
    }
}