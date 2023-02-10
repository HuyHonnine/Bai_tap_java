// Bài tập 7: Viết chương trình liệt kê tất cả các số nguyên tố có 5 chữ số.
public class baitap7 {
    public static void main(String[] args) {
        thuchien();
        for (int i = 0; i < 8363; i++) {
            System.out.print(SNT[i] + " ");
        }
    }

    static int SNT[] = new int[10000];
    static int a = 0;

    public static void thuchien() {
        for (int i = 10000; i <= 100000; i++) {
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
