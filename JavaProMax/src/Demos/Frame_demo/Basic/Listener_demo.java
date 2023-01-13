package Demos.Frame_demo.Basic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Listener_demo {
    public static void main(String[] args) {

        /**
         * 动作事件 : ActionListener
         * 1.鼠标点击
         * 2.空格按键
         */
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        JButton button = new JButton("按钮1");
        button.setBounds(100,100,100,100);
        frame.getContentPane().add(button);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了!");
            }
        });

        //按钮失焦
        button.setFocusable(false);

//        frame.setVisible(true);



        /**
         * 键盘事件
         */

        JButton button2 = new JButton("按钮2");
        button2.setBounds(300,100,100,100);
        frame.getContentPane().add(button2);

        button2.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode==37)
                    System.out.println("左");
                if(keyCode==38)
                    System.out.println("上");
                if(keyCode==39)
                    System.out.println("右");
                if(keyCode==40)
                    System.out.println("下");
            }
        });
        button2.setFocusable(false);

        frame.setVisible(true);

    }
}












