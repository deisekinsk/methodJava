package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import module.operations.interfaces.impl.Calculation;


import java.util.List;

public class EspCalculation implements CalculationInterface {

    @Override
    public double inss(List<Integer> listOfValues) {
        double salario;
        double increValue;
        double percent;

        double faixaA = 1100.01;
        double faixaB = 2203.48;
        double faixaC = 3305.22;
        double faixaD = 6433.57;

        double inss;




        if(salario <= faixaA){
            //7,5%

        }else if (salario > faixaA && salario<= faixaB){
            //9%
        }else if (salario > faixaB && salario<= faixaC){
            percent = 12/100;
            salario = 3000;
            double increValue = (salario*percent);
            inss = ((salario - faixaB).percent) + increValue;

        }else if (salario > faixaC && salario<= faixaD ){
            //14%
        }else{
            System.out.print("This value doesn't work. It's so right");
        }


        return 1.0;
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

