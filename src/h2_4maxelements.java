import java.util.Scanner;

public class h2_4maxelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int max = 0, num = 0;
        while (n != 0) {
            if (n > max) {
                max = n;
                num = 1;
            } else if (n == max) {
                num++;
            }
            n = sc.nextInt();
        }
        System.out.print("Result: " + num);
    }
}
