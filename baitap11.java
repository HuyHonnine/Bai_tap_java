import java.util.Scanner;

public class baitap11 {
    public static void main(String[] args) {
        menu_chuong_trinh();
        ;
        System.out.println("--> Chon: ");
        int c = new Scanner(System.in).nextInt();
        switch (c) {
            case 1:
                baitap1.main(args);
                break;
            case 2:
                baitap2.main(args);
                break;
            case 3:
                baitap3.main(args);
                break;
            case 4:
                baitap4.main(args);
                break;
            case 5:
                baitap5.main(args);
                break;
            case 6:
                baitap6.main(args);
                break;
            case 7:
                baitap7.main(args);
                break;
            case 8:
                baitap8.main(args);
                break;
            case 9:
                baitap9.main(args);
                break;
            case 10:
                baitap10.main(args);
                break;
            default:
                break;
        }
    }

    public static void menu_chuong_trinh() {
        System.out.println("<---------- Chuong Trinh Giai Bai Tap Java---------->");
        System.out.println("0. Thoat khoi chuong trinh");
        System.out.println("1. Chuong trinh giai phuong trinh bac 2:");
        System.out.println("2. Chuong trinh tinh giai thua cua n (n>=0):");
        System.out.println("3. Chuong trinh tim so Fibonacci thu n:");
        System.out.println("4. Chuong trinh tim UCLN va BCNN cua hai so a va b:");
        System.out.println("5. Chuong trinh liet ke tat ca cac so nguyen to nho hon n:");
        System.out.println("6. Chuong trinh liet ke n so nguyen to dau tien:");
        System.out.println("7. Chuong trinh liet ke tat ca cac so nguyen to co 5 chu so:");
        System.out.println("8. Chuong trinh tinh tong cac chu so cua so nguyen n (Vd: 123=1+2+3):");
        System.out.println("9. Chuong trinh liet ke cac so thuan nghich co chua 6 chu so:");
        System.out.println("10. Chuong trinh liet ke cac so Fibonacci nho hon n la so nguyen to:");
    }
}
