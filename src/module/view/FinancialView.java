package module.view;

import module.calculations.interfaces.impl.EspCalculation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FinancialView {

    //put a variable to receive a class
    private EspCalculation espCalculation;

    //Constructor to receive the method of Views
    public FinancialView( ) {financialViews();}

    //Create method of views
    public void financialViews() {
        //instance
        espCalculation = new EspCalculation();

        //receive value
        double flag = Double.parseDouble(JOptionPane.showInputDialog(
                "Qual o seu salário?"));
        List<Double> payValue = new ArrayList<Double>();

        //data value

        //work type

            //date
            payValue.add(flag);

            boolean opr = false;
            String menuSelect;
            String type = "N";

            menuSelect = "Escolha um Cálculo: \n" + "1 = INSS \n" +
                    "2 = FGTS \n" + "3 = IR";

            while (opr != true){
                type = JOptionPane.showInputDialog(menuSelect);
                if(type.equals("1") || type.equals("2") || type.equals("3")){
                    opr = true;
                }
            }

            System.out.println("RESULTADO:");

            switch (type) {
                case "1":
                    //System.out.println("INSS: " + espCalculation.descontoInss(payValue));
                    break;
                case "2":
                    //System.out.println("FGTS: " + espCalculation.fundoGarantia(payValue));
                    break;
                case "3":
                    //System.out.println("IRPF: " + espCalculation.irpf(payValue));
                    break;
            }
    }

}
