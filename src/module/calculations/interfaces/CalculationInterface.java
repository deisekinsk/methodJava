package module.calculations.interfaces;

import java.util.List;

public interface CalculationInterface {
    double descontoInss(double salario);
    double fundoGarantia(double salario);
    int irpf(List<Integer> listOfValues);

}
