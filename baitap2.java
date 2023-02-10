
//Bài tập 2: Tính tổng giai thừa
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-> Nhap n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Xin vui long nhap lai!");
            } else {
                break;
            }
        }
        giaithua(n);
    }

    public static void giaithua(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Tong giai thua cua " + n + "!" + " la " + sum);

    }
}