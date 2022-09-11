import java.util.Scanner;

public class boichungnhonhat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, bcnn;
        System.out.println("\n\nNhập vào số thứ nhất: ");
        n1 = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        n2 = sc.nextInt();

        bcnn = (n1 > n2) ? n1 : n2;
        while (true) {
            if (bcnn % n1 == 0 && bcnn % n2 == 0) {
                System.out.printf("Bội chung nhỏ nhất của %d và %d là %d.", n1, n2, bcnn);
                break;
            }

            ++bcnn;

        }
    }
}
