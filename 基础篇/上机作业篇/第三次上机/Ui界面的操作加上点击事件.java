import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.*;
 import java.awt.*;
// import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main  implements  ActionListener {
    JButton btn = new JButton("提交");
    public static void main(String[] args) {
        Main demo = new Main();
        demo.initUi();
    }
    void initUi() {
        JFrame f = new JFrame("JFrame");
        f.setSize(300, 400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        用户名
        JLabel lableUsername = new JLabel("用户名");
        JTextField username = new JTextField(10);
        JPanel p1 = new JPanel();
        p1.add(lableUsername);
        p1.add(username);
        //口令
        JLabel order = new JLabel("口令");
        JPasswordF ield orderTxet = new JPasswordField(10);
        orderTxet.setEchoChar('*');
        JPanel p2 = new JPanel();
        p2.add(order);
        p2.add(orderTxet);
        f.add(p1);
        f.add(p2);
//        添加单选框
        JPanel p3 = new JPanel();
        JLabel textSH = new JLabel("性别");
//        f.add(new JLabel("性别"));
        ButtonGroup gender = new ButtonGroup();

        String[] buttons = {"男", "女"};
        JRadioButton[] buttonsingle = new JRadioButton[buttons.length];
        for (int i = 0; i < buttons.length; i++) {
            buttonsingle[i] = new JRadioButton(buttons[i]);
            gender.add(buttonsingle[i]);
            p3.add(buttonsingle[i]);
        }
        buttonsingle[1].setSelected(true);
        p3.add(textSH);
        f.add(p3);
//        p3.add(gender);
//  进行多选框
        JPanel p4 = new JPanel();
        JLabel aihao = new JLabel("爱好");
        p4.add(aihao);
//        f.add(new JLabel("爱好"));
        String[] hobit = {"运动", "音乐", "网络"};
        JCheckBox[] hobbies = new JCheckBox[hobit.length];
        for (int j = 0; j < hobit.length; j++) {
            hobbies[j] = new JCheckBox(hobit[j]);
            p4.add(hobbies[j]);
        }
        f.add(p4);

        JTextArea text11 = new JTextArea("此处为简介第二行/r第三行");
        text11.setLineWrap(true); //自动换行
        JScrollPane sp = new JScrollPane(text11);
        sp.setSize(600, 170);
//        sp.setLocation();
        f.add(sp);
//        pp.add(btn);
//        f.add(pp);
        btn.addActionListener(this);
//        JButton btn = new JButton("提交");
        f.add(btn);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) { //这个是检测的点击
        if (e.getSource() == btn) {
            //这个是交互页面的形成
            System.out.println("我爱学习Java");
        }
    }
}
