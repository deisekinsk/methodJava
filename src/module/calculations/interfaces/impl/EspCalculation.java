package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;
import util.Constantes;

import javax.swing.*;

public class EspCalculation implements CalculationInterface {

    @Override
    public double descontoInss(double salario) {

        double inss = 0;


        if(salario <= Constantes.INSS_FAIXA_A){
            inss = salario * Constantes.INSS_PERCENT_A;

        }else if (salario > Constantes.INSS_FAIXA_A && salario<= util.Constantes.INSS_FAIXA_B){
            inss =(Constantes.INSS_FAIXA_A*Constantes.INSS_PERCENT_A)+((salario-Constantes.INSS_FAIXA_A)
                            *Constantes.INSS_PERCENT_B);

        }else if (salario > util.Constantes.INSS_FAIXA_B && salario<= util.Constantes.INSS_FAIXA_C){
            inss =(Constantes.INSS_FAIXA_A*Constantes.INSS_PERCENT_A)
                    +((util.Constantes.INSS_FAIXA_B -Constantes.INSS_FAIXA_A)*Constantes.INSS_PERCENT_B)
                    +((salario- util.Constantes.INSS_FAIXA_B)*Constantes.INSS_PERCENT_C);

        }else if (salario > util.Constantes.INSS_FAIXA_C && salario<= util.Constantes.INSS_FAIXA_D){
            inss =(Constantes.INSS_FAIXA_A*Constantes.INSS_PERCENT_A)
                    +((util.Constantes.INSS_FAIXA_B -Constantes.INSS_FAIXA_A)
                    *Constantes.INSS_PERCENT_B)+((util.Constantes.INSS_FAIXA_C - util.Constantes.INSS_FAIXA_B)
                    *Constantes.INSS_PERCENT_C)+((salario- util.Constantes.INSS_FAIXA_C)*Constantes.INSS_PERCENT_D);

        }else{
            System.out.print("Valor acima do permitido.");
        }
        return inss;
    }

    @Override
    public double  fundoGarantia (double salario) {
        boolean opr = false;
        String menuFGTS;
        String recolhimentoType = "N";
        double recolhimento = 0.0;

        menuFGTS = "Qual o tipo de recolhimento? \n" + "1 = NORMAL \n" + "2 = JOVEM APRENDIZ \n" +
                        "3 = TRABALHADOR DOMÉSTICO/A";
        recolhimentoType = JOptionPane.showInputDialog(menuFGTS);

        if (recolhimentoType.equals("1")){
            recolhimento = 0.08;
        } else if (recolhimentoType.equals("2")){
            recolhimento = 0.02;
        }else if (recolhimentoType.equals("3")){
            recolhimento = 0.12;
        }

        //data para calcular meses
        double flag = Double.parseDouble(JOptionPane.showInputDialog(
                "Quantos meses trabalhados?"));
        double meses = flag;

        double multaRecisoria = 0.40;

        double valorDesconto = salario * recolhimento;
        double recolhimentoMeses = meses * valorDesconto;
        double recolhimentoMulta = recolhimentoMeses + (multaRecisoria*recolhimentoMeses);

        return recolhimentoMulta;
    }


    @Override
    public double irpf(double salario) {

        double classValue = descontoInss(salario);

        double irpfFinal = 0;
        double valorBase = salario - classValue;

        if(valorBase <= Constantes.IRPF_FAIXA_A) {
            System.out.println("Isento");
        }else if (valorBase > Constantes.IRPF_FAIXA_A && valorBase<= Constantes.IRPF_FAIXA_B){
            irpfFinal = (valorBase * 0.075) - Constantes.IRPF_DEDUCTION_A;
        }else if (valorBase > Constantes.IRPF_FAIXA_B && valorBase<= Constantes.IRPF_FAIXA_C){
            irpfFinal = (valorBase * 0.15) - Constantes.IRPF_DEDUCTION_B;
        }else if (valorBase > Constantes.IRPF_FAIXA_C && valorBase<= Constantes.IRPF_FAIXA_D ){
            irpfFinal = (valorBase * 0.225) - Constantes.IRPF_DEDUCTION_C;
        }else if (valorBase > Constantes.IRPF_FAIXA_D){
            irpfFinal = (valorBase * 0.275) - Constantes.IRPF_DEDUCTION_D;
        }else{
            System.out.println("Valor acima do permitido.");
        }

        return irpfFinal;
    }

}

