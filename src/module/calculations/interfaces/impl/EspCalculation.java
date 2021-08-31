package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import module.operations.interfaces.impl.Calculation;


import javax.swing.*;
import java.util.List;

public class EspCalculation implements CalculationInterface {

    @Override
    public double descontoInss(double salario) {
        double inss = 0;

        double faixaA = 1100.01;
        double faixaB = 2203.48;
        double faixaC = 3305.23;
        double faixaD = 6433.57;

        double percentA = 0.075;
        double percentB = 0.09;
        double percentC = 0.12;
        double percentD = 0.14;

        if(salario <= faixaA){
            inss = salario * percentA;

        }else if (salario > faixaA && salario<= faixaB){
            inss = (faixaA*percentA)+((salario-faixaA)*percentB);

        }else if (salario > faixaB && salario<= faixaC){
            inss = (faixaA*percentA)+((faixaB-faixaA)*percentB)+((salario-faixaB)*percentC);

        }else if (salario > faixaC && salario<= faixaD ){
            inss = (faixaA*percentA)+((faixaB-faixaA)*percentB)+((faixaC-faixaB)*percentC)+((salario-faixaC)*percentD);

        }else{
            System.out.print("Value above allowed.");
        }
        return inss;
    }

    @Override
    public double  fundoGarantia (double salario) {


        boolean opr false;

        double recolhimentoNormal= 0.08;
        //double jovemAprendiz = 0.02;
        //double trabaDomestica = 0.12;
        //data para calcular meses
        boolean semJustaCausa = true;
        double multaRecisoria = 0.40;
        double meses = 27;

        double valorDesconto = salario * recolhimentoNormal;
        double recolhimentoMeses = meses * valorDesconto;
        double recolhimentoMulta = recolhimentoMeses + (multaRecisoria*recolhimentoMeses);




        double result = 0;

        try {
            //double desconto =


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Insert a number != 0." + e.getMessage());
        }finally {
            JOptionPane.showMessageDialog(null,"Thank you.");
        }
        return result;





        //return 1;
    }

    @Override
    public int irpf(List<Integer> listOfValues) {
        return 1;
    }

}

