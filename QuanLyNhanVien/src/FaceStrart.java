import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class FaceStrart extends JFrame {
    private JPanel panel1;
    private JPanel face_one;
    private JPanel mask_1;
    private JPanel mask_2;
    private JTable tableView;
    private JButton SiginBT;
    private JButton DeleteBT;
    private JScrollPane view;
    public FaceStrart(){
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,600);
        mask_1.setVisible(true);
        mask_1.setSize(750,600);
        setVisible(true);
        DeleteBT.setVisible(false);
        mask_2.setVisible(true);
        String[] columns = {"Họ và Tên","Giới Tính","Khoa","Kỹ Năng"};
        DefaultTableModel model = new DefaultTableModel(columns, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<NhanVien> l = new file_manager().readNhanVienList();
        for (NhanVien nv : l)
        {
            NhanVien n =nv;
            model.addRow(new Object[] {n.getFullName(),n.getGender(),n.getDepartment(),new skill().Num_to_Skill(n.getSkill())});
        }
        tableView.setRowHeight(60);
        tableView.setModel(model);
        SiginBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FaceSigin();
            }
        });

        tableView.addComponentListener(new ComponentAdapter() {
        });

        tableView.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index=tableView.getSelectedRow();
                if(index!=-1){
                    DeleteBT.setVisible(true);
                }
            }
        });
        DeleteBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index=tableView.getSelectedRow();
                ((DefaultTableModel)tableView.getModel()).removeRow(index);
                l.remove(index);
                new file_manager().saveNhanVienList(l);
                DeleteBT.setVisible(false);
            }
        });
    }
}
