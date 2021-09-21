package module.view;


import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame{

    //constructor
    public MenuView(){

        JFrame f= new JFrame("Calculadora Matemática e Financeira");
        JPanel panel=new JPanel();
        panel.setBounds(100,250,200,200);

        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Escolha uma opção: ");


        JButton b1=new JButton("Confirma");
        b1.setBounds(100,100,80,30);
        //b1.setBackground(Color.blue);

        panel.add(label);
        panel.add(b1);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }


}
