import java.util.Scanner;

public class Main { // Semicolon added

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
  
      System.out.print("Nhap so nguyen duong: ");
      int n = scanner.nextInt();
  
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
  
      if (sum % 2 == 0) {
        System.out.println("Tong la so chan.");
      } else {
        System.out.println("Tong la so le.");
      }
    }
  }
  