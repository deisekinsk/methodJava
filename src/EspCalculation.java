import java.util.List;

public class EspCalculation extends Calculation {

    static double meanNum(List<Integer> listOfValues){
        //Como chamar o método sumNum?
        int result = Calculation.sumNum(listOfValues);
        int sizeList = listOfValues.size();
        double mean = result/sizeList;

        return mean;

    }

}

