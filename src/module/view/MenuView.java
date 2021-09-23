package module.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuView extends JFrame implements ActionListener{

    private FinancialView financialView;
    private MathView mathView;

    //constructor
    public MenuView(){
        super("Calculadora Matemática e Financeira.");

        financialView = new FinancialView();
        mathView = new MathView();


        JPanel panel=new JPanel();
        panel.setBounds(100,125,200,200);

        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Escolha uma opção: ");


        JButton b1=new JButton("Matemática");
        b1.setBounds(0,0,80,30);

        JButton b2=new JButton("Financeira");
        b2.setBounds(0,0,80,30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathView = new MathView();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                financialView = new FinancialView();
            }
        });

        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        add(panel);



        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
