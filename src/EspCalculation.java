import java.util.List;

public class EspCalculation {

    static int meanNum(List<Integer> listOfValues){
        //Como chamar o método sumNum?
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result += listOfValues.get(i);
        }
        return result/sizeList;

    }

}

