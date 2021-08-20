package module.calculations.interfaces;

import java.util.List;

public interface CalculationInterface {
    double inss(List<Integer> listOfValues);
    int fundoGarantia(List<Integer> listOfValues);
    int irpf(List<Integer> listOfValues);

}
