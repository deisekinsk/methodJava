import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //void = don't return
    //static =
    public static void main(String[] args){


        //catch values
        int flag = Integer.parseInt(JOptionPane.showInputDialog(
                "Insert numbers | 0 = Exit"));
        List<Integer> values = new ArrayList<Integer>();

        while (flag != 0){
            values.add(flag);
            flag = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insert numbers | 0 = Exit"));
        }

        //object
        Calculation calculation = new Calculation();

        //print
        //Como imprimir de volta os valores digitados? --LEO
        System.out.println("Decrease: "+Calculation.decreaseNum(values));

        //System.out.print(Calculation.divisionNum(45,5));
        System.out.print("Division: "+Calculation.divisionNum(5,50));


    }

}
