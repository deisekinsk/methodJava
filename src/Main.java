import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


     boolean op = false;
     String operacao = "N";

     while (op != true){
          operacao =  JOptionPane.showInputDialog("Digite 1 para somar, 2 Subtrair, 3 Multiplicar, 4 divisao ");
          if(operacao.equals(1) || operacao.equals(2) || operacao.equals(3)  || operacao.equals(4) ){
              op = true;
          }

     }


     int flag =  Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para finalizar"));

     List<Integer> valores = new ArrayList<Integer>();


     while( flag != 0){
         valores.add(flag);
         flag = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para finalizar"));
     }

     //Cria o objeto calculo
     Calculo calculo = new Calculo();


     //verificar operacao

        if(operacao.equals(1)){
            if(valores.size() == 2){
                System.out.println(calculo.somarValores(valores.get(0), valores.get(1)));

            }else if(valores.size() == 3){
                System.out.println(calculo.somarValores(valores.get(0), valores.get(1), valores.get(2)));

            }else{
                System.out.println(Calculo.somarValores(valores));

            }
        }


     Calculo.subtrair(1,2);
     Calculo.dividir(8,2);






    }
}