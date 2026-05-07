import java.io.*;
import java.util.ArrayList;

public class file_manager  {
    public ArrayList<NhanVien> readNhanVienList() {
        ArrayList<NhanVien> list = new ArrayList<>();
        File file = new File("NhanVien.txt");

        if (!file.exists()) return list; // Trả về list rỗng nếu chưa có file

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Đọc và ép kiểu về ArrayList<NhanVien>
            list = (ArrayList<NhanVien>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return list;
    }

    public void saveNhanVienList(ArrayList<NhanVien> list) {
        File file = new File("NhanVien.txt"); // Nên dùng đuôi .dat hoặc .bin

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(list);
            System.out.println("Lưu danh sách nhân viên thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
