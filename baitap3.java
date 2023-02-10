// Bài tập 3. viết Chuong trinh tim so Fibonacci thu n.
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap so Fibonacci can tim: ");
        int n = new Scanner(System.in).nextInt();
        thuchien();
        System.out.print(Fibonacci[n]);
    }

    static int Fibonacci[] = new int[100001];

    public static void thuchien() {
        Fibonacci[1] = Fibonacci[2] = 1;
        for (int i = 3; i < Fibonacci.length; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
        }
    }
}
