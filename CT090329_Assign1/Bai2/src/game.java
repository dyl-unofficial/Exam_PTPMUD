import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game extends JFrame{
    private JPanel JPmain;
    private JButton check;
    private JTextField textField1;
    private JLabel hiden;

    public game() {
        Integer num = (Integer.valueOf(String.valueOf((int) (Math.random() * (100)) + 1)).intValue());
        System.out.println(num);
        setContentPane(JPmain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,120);
        setVisible(true);
        hiden.setText("");
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.equals(null)){
                    JOptionPane.showMessageDialog(
                            null,
                            "Chưa nhâp số",
                            "Thông báo",
                            0
                    );
                }
                else{
                    Integer human = Integer.valueOf(String.valueOf(textField1.getText())).intValue();
                    if (human==num){
                        hiden.setText("");
                        JOptionPane.showMessageDialog(
                                null,
                                "Chúc mưng ban đã đoán đúng",
                                "Thông báo",
                                0);
                    }
                    else {
                        hiden.setForeground(Color.RED);
                        if(num<human) hiden.setText("Bạn đoán sai. Số bạn cần tìm nhỏ hơn số :"+human);
                        else hiden.setText("Bạn đoán sai. Số bạn cần tìm lớn hơn số :"+human);

                    }
                }
            }
        });
    }
}
