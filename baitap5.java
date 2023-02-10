// Bài tập 5: Viết chương trình liệt kê các số nguyên tố nhỏ hơn n
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("-> Nhap n: ");
        n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " la:");
        for (int i = 2; i <= n; i++) {
            if (snt(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean snt(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
