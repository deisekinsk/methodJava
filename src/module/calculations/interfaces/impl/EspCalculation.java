package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import module.operations.interfaces.impl.Calculation;


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
    public int fundoGarantia(List<Integer> listOfValues) {
        return 1;
    }

    @Override
    public int irpf(List<Integer> listOfValues) {
        return 1;
    }

}

