package module.calculations.interfaces.impl;

import module.calculations.interfaces.CalculationInterface;


import javax.swing.*;

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
        }else{
            recolhimento = 0.12;
        }

        //data para calcular meses
        double meses = 27;
        double multaRecisoria = 0.40;

        double valorDesconto = salario * recolhimento;
        double recolhimentoMeses = meses * valorDesconto;
        double recolhimentoMulta = recolhimentoMeses + (multaRecisoria*recolhimentoMeses);

        //salario 1285,00 | 02/04/16 a 25/07/2018 | Desconto 102.80 | FGTS 2775.6 | Mais 40% 3885,84
        return recolhimentoMulta;
    }

    //List<Integer> sortList(List<Integer> listOfValues)

    @Override
    public double irpf(double salario) {
        double inss = 0;
        descontoInss(inss);

        double irpfFinal = 0;
        double valorBase = salario - inss;


        double faixaA = 1903.99;
        double faixaB = 2826.66;
        double faixaC = 3751.05;
        double faixaD = 4664.68;

        double deducaoA = 142.80;
        double deducaoB = 354.80;
        double deducaoC = 636.13;
        double deducaoD = 869.36;

        if(valorBase <= faixaA) {
            System.out.println("Isento");
        }else if (valorBase > faixaA && valorBase<= faixaB){
            irpfFinal = (valorBase * 0.075) - deducaoA;
        }else if (valorBase > faixaB && valorBase<= faixaC){
            irpfFinal = (valorBase * 0.15) - deducaoB;
        }else if (valorBase > faixaC && valorBase<= faixaD ){
            irpfFinal = (valorBase * 0.225) - deducaoC;
        }else if (valorBase > faixaD){
            irpfFinal = (valorBase * 0.275) - deducaoD;
        }else{
            System.out.println("Valor acima do permitido.");
        }

        return irpfFinal;
    }

}

