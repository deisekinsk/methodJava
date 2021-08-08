import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //void = don't return
    //static = call external methods
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
        //Print ordering of values
        System.out.println("Your numbers in crescent order are :" + Calculation.sortList(values));

        //System.out.print(Calculation.divisionNum(45,5));
        System.out.println("Division: "+Calculation.divisionNum(5,27));
        System.out.println("Summation: "+Calculation.sumNum(values));
        System.out.println("Multiplication: "+Calculation.multiNum(values));
        System.out.println("Decrease: "+Calculation.decreaseNum(values));


    }

}
