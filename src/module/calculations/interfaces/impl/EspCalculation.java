package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import module.operations.interfaces.impl.Calculation;


import java.util.List;

public class EspCalculation implements CalculationInterface {

    @Override
    public double inss(List<Integer> listOfValues) {
        double salario = 0;

        if(salario <= 1100){
            //7,5%

        }else if (salario > 1100.01 && salario<= 2203.48){
            //9%
        }else if (salario > 2203.48 && salario<= 3305.22){
            //12%
        }else if (salario > 3305.22 && salario<= 6433.57){
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

