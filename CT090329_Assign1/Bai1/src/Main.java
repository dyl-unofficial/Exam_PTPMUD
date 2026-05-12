import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PHẦN 1: KHỞI TẠO ĐỐI TƯỢNG LỚP BAO ===");
        System.out.print("Nhập vào một số nguyên (Integer): ");
        Integer intObj = Integer.valueOf(scanner.nextInt());

        System.out.print("Nhập vào một số thực (Double): ");
        Double doubleObj = Double.valueOf(scanner.nextDouble());

        System.out.print("Nhập vào một giá trị logic (Boolean - true/false): ");
        Boolean boolObj = Boolean.valueOf(scanner.nextBoolean());

        System.out.print("Nhập vào một ký tự (Character): ");
        Character charObj = Character.valueOf(scanner.next().charAt(0));


        System.out.println("\n=== PHẦN 2: CHUYỂN VỀ KIỂU NGUYÊN THỦY (UNBOXING) ===");
        int primitiveInt = intObj.intValue();
        double primitiveDouble = doubleObj.doubleValue();
        boolean primitiveBool = boolObj.booleanValue();
        char primitiveChar = charObj.charValue();

        System.out.println("Giá trị int nguyên thủy: " + primitiveInt);
        System.out.println("Giá trị double nguyên thủy: " + primitiveDouble);
        System.out.println("Giá trị boolean nguyên thủy: " + primitiveBool);
        System.out.println("Giá trị char nguyên thủy: " + primitiveChar);


        System.out.println("\n=== PHẦN 3: CHUYỂN CHUỖI NHỊ PHÂN THÀNH SỐ NGUYÊN ===");
        System.out.print("Nhập vào một chuỗi nhị phân (ví dụ: 1010): ");
        String binaryString = scanner.next();

        try {
            Integer decimalValue = Integer.valueOf(binaryString, 2);
            System.out.println("Kết quả: Chuỗi nhị phân '" + binaryString + "' có giá trị số nguyên là " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: '" + binaryString + "' không phải là chuỗi nhị phân hợp lệ.");
        }

        scanner.close();
    }
}