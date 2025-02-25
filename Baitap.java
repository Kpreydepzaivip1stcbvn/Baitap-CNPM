import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        
        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
            return; 
        }

        long giaiThua = 1; 
        for (int i = 1; i <= n; i++) {
            giaiThua *= i; 
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        
        scanner.close(); 
    }
}
