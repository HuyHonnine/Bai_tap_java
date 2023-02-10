// Bài tập 9: Viết chương trình liệt kê các số thuật nghịch có 6 chứ số
public class baitap9 {
    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            if (thuchien(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean thuchien(int n) {
        int str = n;
        int tmp = 0;
        while (n > 0) {
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        if (tmp == str) {
            return true;
        }
        return false;
    }
}
