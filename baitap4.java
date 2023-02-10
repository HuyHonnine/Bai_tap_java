// Bài tập 4: Viết chương trình tìm UCLN va BCNN của hai so a va b
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("-> Nhap a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(ucln(a, b));
        System.out.println(bcnn(a, b));

    }

    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    public static int bcnn(int a, int b) {
        return a * b / ucln(a, b);
    }
}
