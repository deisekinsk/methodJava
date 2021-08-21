package module.calculations.interfaces;

import java.util.List;

public interface CalculationInterface {
    double descontoInss(double salario);
    int fundoGarantia(List<Integer> listOfValues);
    int irpf(List<Integer> listOfValues);

}
