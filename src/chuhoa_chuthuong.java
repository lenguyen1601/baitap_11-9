import java.util.Scanner;

public class chuhoa_chuthuong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần in thường: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi in hoa: ");
        //sử dụng phương thức toLowerCase() để in thường các ký tự trong chuỗi
        System.out.println(message.toLowerCase());
    }
}