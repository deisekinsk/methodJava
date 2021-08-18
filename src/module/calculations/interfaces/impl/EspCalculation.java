package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import module.operations.interfaces.impl.Calculation;

import java.util.List;

public class EspCalculation implements CalculationInterface {
    int result;
    int sizeList;
    @Override
    public void meanNum(List<Integer> listOfValues){

        result = Calculation.sumNum(listOfValues);
        sizeList = listOfValues.size();
        double mean = result/sizeList;

        //return mean;

    }

}

