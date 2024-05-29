import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    Menu(){
        setTitle("MENU");
        setLayout(null);

        JTextField food = new JTextField("    Food restauran");
        food.setBounds(0, 0, 1400,50);
        food.setFont(new Font("Tahoma",Font.BOLD,20));
        food.setForeground(new Color(255,255,255));
        food.setBackground(new Color(0,0,255));
        add(food);


        //////////////////////   1st img code ///////////////////////

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/burger.jpeg"));
        Image i2 = i1 .getImage().getScaledInstance(180,180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 550,550);
        add(image);



        JLabel burger = new JLabel("HamBurge");
        burger.setBounds(190,380, 150,30);
        burger.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(burger);

        JLabel price = new JLabel("Price  200");
        price.setBounds(190,410, 150,30);
        price.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(price);

        JLabel total = new JLabel("Total  1");
        total.setBounds(190,430, 150,30);
        total.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total);

        JButton b1 = new JButton("+");
        b1.setBounds(190,465, 80,20);
        b1.setBackground(new Color(0,0,255));
        b1.setForeground(new Color(255,255,255));
        add(b1);

        JButton b2 = new JButton("-");
        b2.setBounds(280,465, 80,20);
        b2.setBackground(new Color(153,153,153));
        b2.setForeground(new Color(255,255,255));

        add(b2);

        //////////////////////   2nd img code ///////////////////////

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/fries.jpeg"));
        Image i5 = i4 .getImage().getScaledInstance(180,180, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(0, 0, 1050,550);
        add(image2);


        JLabel fries = new JLabel("Fries");
        fries.setBounds(440,380, 150,30);
        fries.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(fries);

        JLabel price2 = new JLabel("Price  100");
        price2.setBounds(440,410, 150,30);
        price2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(price2);

        JLabel total1 = new JLabel("Total  1");
        total1.setBounds(440,430, 150,30);
        total1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total1);

        JButton b3 = new JButton("+");
        b3.setBounds(440,465, 80,20);
        b3.setBackground(new Color(0,0,255));
        b3.setForeground(new Color(255,255,255));
        add(b3);

        JButton b4 = new JButton("-");
        b4.setBounds(540,465, 80,20);
        b4.setBackground(new Color(255, 16, 240));
        b4.setForeground(new Color(255,255,255));
        add(b4);

        ///////////////////////// 3rd img code //////////////


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/Coke.jpeg"));
        Image i8 = i7 .getImage().getScaledInstance(180,180, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(0, 0, 1550,550);
        add(image3);


        JLabel coke = new JLabel("COKE");
        coke.setBounds(690,380, 150,30);
        coke.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(coke);

        JLabel price3 = new JLabel("Price  50");
        price3.setBounds(690,410, 150,30);
        price3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(price3);

        JLabel total3 = new JLabel("Total  1");
        total3.setBounds(690,430, 150,30);
        total3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total3);

        JButton b5 = new JButton("+");
        b5.setBounds(690,465, 80,20);
        b5.setBackground(new Color(0,0,255));
        b5.setForeground(new Color(255,255,255));
        add(b5);

        JButton b6 = new JButton("-");
        b6.setBounds(780,465, 80,20);
        b6.setBackground(new Color(255, 16, 240));
        b6.setForeground(new Color(255,255,255));
        add(b6);

        /////////////////// 4th img code /////////////


        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/pepsi.jpeg"));
        Image i11 = i10 .getImage().getScaledInstance(180,180, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image4 = new JLabel(i12);
        image4.setBounds(0, 0, 2050,550);
        add(image4);


        JLabel pepsi = new JLabel("Pepsi");
        pepsi.setBounds(940,380, 150,30);
        pepsi.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(pepsi);

        JLabel price4 = new JLabel("Price  50");
        price4.setBounds(940,410, 150,30);
        price4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(price4);

        JLabel total4 = new JLabel("Total  1");
        total4.setBounds(940,430, 150,30);
        total4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total4);

        JButton b7 = new JButton("+");
        b7.setBounds(940,465, 80,20);
        b7.setBackground(new Color(0,0,255));
        b7.setForeground(new Color(255,255,255));
        add(b7);

        JButton b8 = new JButton("-");
        b8.setBounds(1030,465, 80,20);
        b8.setBackground(new Color(255, 16, 240));
        b8.setForeground(new Color(255,255,255));
        add(b8);




        setSize(1400,730);
        // setLocation(280,80);
        setLocation(0,0);
        setVisible(true);



    }



    public static void main(String[] args){

        new Menu();



    }

}
