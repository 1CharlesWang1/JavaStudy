package Demos.Frame_demo.Basic;

import javax.swing.*;

public class JFrame_demo {
    public static void main(String[] args) {

        /**
         * 1.JFrame: 创建窗体
         */

        //创建窗体对象
        JFrame frame = new JFrame();

        //设置窗体大小
        frame.setSize(500,600);

        //修改窗体关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗体标题
        frame.setTitle("test1");

        //取消窗体默认布局
        frame.setLayout(null);



        /**
         * 2.JButton 按钮构造方法
         * JButton(): 创建空白按钮
         * JButton(String text): 创建带文本按钮
         */

        //创建按钮对象
        JButton button = new JButton("点我");
        button.setBounds(50,50,100,100);
        //将按钮添加到窗体
        frame.getContentPane().add(button);

//        frame.setVisible(true);



        /**
         * 3.JLabel: 展示文本和图片
         * JLabel 构造方法 :
         * JLabel(String text) 使用指定文本创建 JLabel对象
         * JLabel(Icon image) 创建一个具有置顶图形的 JLabel对象
         */

        //JLabel展示文本
        JLabel jLabel1 = new JLabel("我是wcl");
        jLabel1.setBounds(200,50,50,50);
        frame.getContentPane().add(jLabel1);

        JLabel jLabel2 = new JLabel("他是cyb");
        jLabel2.setBounds(200,100,50,50);
        frame.getContentPane().add(jLabel2);

        JLabel imgLabel = new JLabel(new ImageIcon("C:\\Users\\WCL\\Desktop\\PS\\黑白校徽.png"));
        imgLabel.setBounds(300,50,112,122);
        frame.getContentPane().add(imgLabel);

        frame.setVisible(true);

    }
}
















