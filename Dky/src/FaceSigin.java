import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import javax.tools.FileObject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class FaceSigin extends JFrame {
    private JPanel JPmain;
    private JTextField fullName;
    private JRadioButton boyR;
    private JRadioButton girlR;
    private JComboBox box;
    private JCheckBox _1;
    private JPanel JPskill;
    private JButton SaveBT;
    private JButton returnBT;
    private JCheckBox _2;
    private JCheckBox _4;
    private JLabel lablel_FullName;


    private String getGender(ButtonGroup gen){
        String g=new String();
        if(boyR.isSelected()) g="Nam";
        else if(girlR.isSelected()) g="Nữ";
        else g=null;
        return g;
    }
    private int getNumSkill(JPanel k){
        int C=0;
        if(_1.isSelected()) C+=1;
        if(_2.isSelected()) C+=2;
        if(_4.isSelected()) C+=4;
        return C;
    }
    public FaceSigin()
    {
        ArrayList <NhanVien> Arr = new file_manager().readNhanVienList();
        setContentPane(JPmain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.getWidth() * 0.2);
        int height = (int) (screenSize.getHeight() * 0.3);
        setSize(width,height);
        setVisible(true);
        //JPskill.setSize((int) (width*0.1),(int) (height*0.5));
        JPskill.setBorder(BorderFactory.createLineBorder(Color.black));
        ButtonGroup genger = new ButtonGroup();
        genger.add(boyR);
        genger.add(girlR);
        returnBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FaceStrart();
            }
        });
        SaveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lablel_FullName.setForeground(Color.black);
                System.out.println(" :"+getNumSkill(JPskill) +":"+(String)(new skill().Num_to_Skill(4)));
                if(fullName.getText().equals("")) {
                    lablel_FullName.setForeground(Color.red);
                    JOptionPane.showMessageDialog(
                            null,
                            "Vui lòng không để trống họ tên!",
                            "Thông báo lỗi",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                else{
                    NhanVien nv= new NhanVien();
                    nv.setFullName(fullName.getText());
                    nv.setDepartment((String) box.getSelectedItem());
                    nv.setSkill(getNumSkill(JPskill));
                    nv.setGender(getGender(genger));
                    Arr.add(nv);
                    new file_manager().saveNhanVienList(Arr);
                }
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}