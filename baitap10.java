
// Bài tập 10: Viết chương trình liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố
import java.util.Scanner;

public class baitap10 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        thuchien();
        int i = 1;
        while (Fibonacci[i] < n) {
            if (snt(Fibonacci[i])) {
                System.out.print(Fibonacci[i] + " ");
            }
            i++;
        }
    }

    static int Fibonacci[] = new int[100001];

    public static void thuchien() {
        Fibonacci[1] = Fibonacci[2] = 1;
        for (int i = 3; i < Fibonacci.length; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
        }
    }

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
