import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main(){
        setTitle("FOODS RESTAURANT");
        setLayout(null);



        JTextField food = new JTextField("    Food restauran");
        food.setBounds(0, 0, 1400,50);
        food.setFont(new Font("Tahoma",Font.BOLD,20));
        food.setForeground(new Color(255,255,255));
        food.setBackground(new Color(0,0,255));
        add(food);


        JLabel name = new JLabel("WELCOME TO FOOD'S KITCHEN");
        name.setBounds(450,200, 500,200);
        name.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(name);

        JButton menu = new JButton("Go to Menu");
        menu.setBounds(600,350,100,30);
        menu.setBackground(new Color(0,0,255));
        menu.setForeground(new Color(255,255,255));
        add(menu);




        setSize(1400,730);
       // setLocation(280,80);
        setLocation(0,0);
        setVisible(true);



    }

    public static void main(String[] args){

        new Main();



    }

}
