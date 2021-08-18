package module.view;

import module.operations.interfaces.impl.Calculation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AppView {

    //variavel que recebe uma classe
    private Calculation calculation;

    public AppView() {
        showViews();
    }

    public void showViews() {
        //instancia a classe
        calculation = new Calculation();
        //
        int flag = Integer.parseInt(JOptionPane.showInputDialog(
                "Insert numbers | 0 = Exit"));
        List<Integer> values = new ArrayList<Integer>();

        while (flag != 0) {
            values.add(flag);
            flag = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insert numbers | 0 = Exit"));}
            //
            boolean opr = false;
            String menuSelect;
            String type = "N";

            menuSelect = "Choose the option: \n" + "1 = Summation\n" + "2 = Decrease\n" + "3 = Division\n" + "4 = " +
                    "Multiplication";
            //opr != true | !opr
            while (opr != true) {
                type = JOptionPane.showInputDialog(menuSelect);
                if (type.equals("1") || type.equals("2") || type.equals("3") || type.equals("4")) {
                    opr = true;
                }
            }

            System.out.println("Numbers: " + calculation.sortList(values));

            //
            switch (type) {
                case "1":
                    System.out.println("Summation: " + calculation.sumNum(values));
                    break;
                case "2":
                    System.out.println("Decrease: " + calculation.decreaseNum(values));
                    break;
                case "3":
                    System.out.println("Division 01: " + calculation.divisionNum(45, 0));
                    System.out.println("Division 02: " + calculation.divisionNum(45, 5));
                    break;
                case "4":
                    System.out.println("Multiplication: " + calculation.multiNum(values));
                    break;
            }
        }
    }

