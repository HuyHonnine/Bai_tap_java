// Bài tập 8: Viết chương trình tính tổng các chữ số của số nguyên n (Vd: 123=1+2+3):
import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        long n = new Scanner(System.in).nextLong();
        System.out.print("Vay tong cua " + n + " la " +tachchuoi(n) );
    }

    public static int tachchuoi(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
