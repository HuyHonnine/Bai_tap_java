// Bài tập 6: Viết chương trình liệt kê n số nguyên tố đầu tiên.
import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap so nguyen to can tim: ");
        int n = new Scanner(System.in).nextInt();
        thuchien();
        for (int i = 0; i <= n; i++) {
            System.out.print(SNT[i] + " ");
        }
    }

    static int SNT[] = new int[100001];
    static int a = 0;

    public static void thuchien() {
        for (int i = 2; i < 100001; i++) {
            if (snt(i)) {
                SNT[a++] = i;
            }
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
