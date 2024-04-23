import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so nguyen duong: ");
        int n = scanner.nextInt();

        int sum = calculateSumOfPositiveIntegers(n); // Gọi phương thức đã được triển khai

        if (sum % 2 == 0) {
            System.out.println("Tong la so chan.");
        } else {
            System.out.println("Tong la so le.");
        }
    }

    public static int calculateSumOfPositiveIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isEvenSum(int sum) {
        return sum % 2 == 0;
    }

    public static boolean isOddSum(int sum) {
        return !isEvenSum(sum); // Hoặc return sum % 2 != 0;
    }
}
