package Demos.Frame_demo.Game.Codes;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {

    int data[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int win[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int row;
    int column;
    int count;

    public MainFrame() {

        // 窗体对象.addKeyListener(KeyListener实现对象);
        this.addKeyListener(this);
        //初始化窗体
        initFrame();
        //打乱顺序
        initData();
        //绘制图形界面
        paintView();
        //设置窗体可见
        setVisible(true);

    }

    /**
     * 初始化窗体
     */
    public void initFrame() {

        setSize(514, 595);

        setDefaultCloseOperation(3);

        setTitle("石头游戏");

        setLayout(null);
        //设置窗体置顶
        setAlwaysOnTop(true);
        //设置窗体居中
        setLocationRelativeTo(null);

    }


    /**
     * 初始化数据(打乱数组)
     */
    public void initData() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int randomX = random.nextInt(4);
                int randomY = random.nextInt(4);
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }

    }


    /**
     * 绘制游戏界面
     */
    public void paintView() {

        getContentPane().removeAll();

        if (victory()) {
            JLabel victory = new JLabel(new ImageIcon("JavaProMax\\src\\Demos\\Frame_demo\\Game\\pictiures\\win.png"));
            victory.setBounds(124, 230, 266, 88);
            getContentPane().add(victory);
        }

        JLabel countLabel = new JLabel("步数为:" + count);
        countLabel.setBounds(50, 20, 100, 20);
        getContentPane().add(countLabel);

        JButton restart = new JButton("重新开始");
        restart.setBounds(350, 15, 100, 20);
        getContentPane().add(restart);
        restart.addActionListener(e -> {
            count = 0;
            initData();
            paintView();
        });
        restart.setFocusable(false);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("JavaProMax\\src\\Demos\\Frame_demo\\Game\\pictiures\\" + data[i][j] + ".png"));
                imageLabel.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                getContentPane().add(imageLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("JavaProMax\\src\\Demos\\Frame_demo\\Game\\pictiures\\background.png"));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);

        getContentPane().repaint();

    }

    private boolean victory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 移动操作
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //移动业务
        move(keyCode);
        //移动后重新绘制界面
        paintView();
    }

    private void move(int keyCode) {

        if (victory()) {
            return;
        }

        try {
            if (keyCode == 37) {
                int temp = data[row][column + 1];
                data[row][column + 1] = data[row][column];
                data[row][column] = temp;
                column++;
                count++;

            } else if (keyCode == 38) {
                int temp = data[row + 1][column];
                data[row + 1][column] = data[row][column];
                data[row][column] = temp;
                row++;
                count++;

            } else if (keyCode == 39) {
                //data[row][column-1]==10
                int temp = data[row][column - 1];
                data[row][column - 1] = data[row][column];
                data[row][column] = temp;
                column--;
                count++;

            } else if (keyCode == 40) {
                int temp = data[row - 1][column];
                data[row - 1][column] = data[row][column];
                data[row][column] = temp;
                row--;
                count++;

            } else if (keyCode == 90) {
                data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
