import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String typeOpr() {
        boolean opr = false;
        String menuSelect;
        String type = "N";

        menuSelect = "Choose the option: \n" + "1 = Summation\n" + "2 = Decrease\n" + "3 = Division\n" + "4 = " +
                "Multiplication";
        //opr != true | !opr
        while( opr != true){
            type =JOptionPane.showInputDialog(menuSelect);
            if(type.equals("1") || type.equals("2") || type.equals("3") || type.equals("4")){
                opr = true;
            }
        }
        return type;
    }


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

        Main c = new Main();
        c.typeOpr();

        //Print ordering of values
        System.out.println("Your numbers in crescent order are :" + Calculation.sortList(values));

    String chooseCase = "0";

    switch( chooseCase){
        case "1":
            //typeOpr( );
            chooseCase = "1";
            System.out.println("Summation: "+Calculation.sumNum(values));
            break;
        case "2":
            System.out.println("Decrease: "+Calculation.decreaseNum(values));
            break;
        case "3":
            System.out.println("Division 01: "+Calculation.divisionNum(45,0));
            System.out.println("Division 02: "+Calculation.divisionNum(45,5));
            break;
        case "4":
            System.out.println("Multiplication: "+Calculation.multiNum(values));
            break;
    }

    }



}
