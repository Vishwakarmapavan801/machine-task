import javax.swing.*;
import java.awt.*;

public class Order extends JFrame {

    Order(){
        setTitle("MENU");
        setLayout(null);


        JLabel fries = new JLabel("Order Summary");
        fries.setBounds(10,0, 200,30);
        fries.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(fries);

        JLabel cock = new JLabel("Cock ");
        cock.setBounds(10,45, 200,20);
        cock.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(cock);

        JLabel cock1 = new JLabel("2");
        cock1.setBounds(100,45, 200,20);
        cock1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(cock1);

        JLabel fries1 = new JLabel("Fries");
        fries1.setBounds(12,70, 200,20);
        fries1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(fries1);

        JLabel fries2 = new JLabel("1");
        fries2.setBounds(100,70, 200,20);
        fries2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(fries2);

        JLabel total = new JLabel("Total (INR):");
        total.setBounds(10,100, 200,20);
        total.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total);

        JLabel total2  = new JLabel("200");
        total2.setBounds(100,100, 200,20);
        total2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(total2);




        JButton b3 = new JButton("+");
        b3.setBounds(200,45, 80,20);
        b3.setBackground(new Color(0,0,255));
        b3.setForeground(new Color(255,255,255));
        add(b3);

        JButton b4 = new JButton("-");
        b4.setBounds(320,45, 80,20);
        b4.setBackground(new Color(255, 16, 240));
        b4.setForeground(new Color(255,255,255));
        add(b4);

        JButton b5 = new JButton("+");
        b5.setBounds(200,70, 80,20);
        b5.setBackground(new Color(0,0,255));
        b5.setForeground(new Color(255,255,255));
        add(b5);

        JButton b6 = new JButton("-");
        b6.setBounds(320,70, 80,20);
        b6.setBackground(new Color(255, 16, 240));
        b6.setForeground(new Color(255,255,255));
        add(b6);

        JButton b7 = new JButton("SAVE AND CHECKOUT");
        b7.setBounds(200,110, 160,20);
        b7.setBackground(new Color(0,0,255));
        b7.setForeground(new Color(255,255,255));
        add(b7);

        JButton b8 = new JButton("CANCEL");
        b8.setBounds(380,110, 80,20);
        b8.setBackground(new Color(255,255,255));
        b8.setForeground(Color.BLACK);
        add(b8);





        setSize(500,200);
         setLocation(410,250);
        //setLocation(0,0);
        setVisible(true);



    }








    public static void main(String[] args){

        new Order();



    }

}
