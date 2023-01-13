package Demos.Frame_demo.Basic;

import javax.swing.*;

public class qwe {
    public static void main(String[] args) {

        //创建窗体对象
        JFrame frame = new JFrame("你好");

        //设置窗体大小
        frame.setSize(500,600);

        //修改窗体关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JButton button = new JButton("点我+1");
        button.setBounds(50,50,100,100);

        //将按钮添加到窗体
        frame.getContentPane().add(button);

        String a = "null";

        JLabel jLabel1 = new JLabel(a);
        jLabel1.setBounds(200,50,50,50);
        frame.getContentPane().add(jLabel1);

        frame.setVisible(true);

    }
}
