import java.util.Scanner;

public class chuthuong_chuhoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi in hoa: ");
        //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
        System.out.println(message.toUpperCase());

    }
}