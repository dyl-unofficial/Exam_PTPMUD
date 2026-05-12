import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PHẦN 1: NHẬP DỮ LIỆU ===");
        System.out.print("Nhập vào chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        System.out.println("\n=== PHẦN 2: THỰC HIỆN THAO TÁC ===");
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        String concatenatedString = sb.toString();
        System.out.println("1. Chuỗi sau khi ghép: " + concatenatedString);
        String uppercaseString = concatenatedString.toUpperCase();
        System.out.println("2. Chuỗi in hoa: " + uppercaseString);
        int indexOfA = concatenatedString.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("3. Vị trí xuất hiện đầu tiên của ký tự 'a' là: " + indexOfA);
        } else {
            System.out.println("3. Ký tự 'a' không xuất hiện trong chuỗi đã ghép.");
        }
        scanner.close();
    }
}
