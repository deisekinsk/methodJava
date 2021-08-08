import java.util.List;

public class Calculation {
//Pq RESULT=0 não pode ser uma variável global? --LEO!!

    static int sumNum(List<Integer> listOfValues){
        //roam values | for(Integer i:listOfValues)
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result += listOfValues.get(i);
        }
        return result;
    }

    static int decreaseNum(List<Integer> listOfValues){
        int result = 0;
        int sizeList = listOfValues.size();
        //ERRO NO LOOP PARA SUBTRAIR --LEO
        for(int i = 0; i < sizeList; i++){
            result += listOfValues.get(i);
        }
        return result;

    }

    static int divisionNum(int val1, int val2){
        int result = 0;

        //val1 +
        if (val1 > val2){
            result = val1/val2;
        }else{
            result = val2/val1;
        }

        return result;
    }

    //TENTANDO ELABORAR DIVISAO POR LISTA | double?
    /*static int divisionNum(List<Integer> listOfValues){
        //roam values | for(Integer i:listOfValues)
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result = listOfValues.get(i);
        }
        //BUGUEI!
        if (val1 > val2){
            result = val1/val2;
        }else{
            result = val2/val1;
        }

        return result;
    }*/

    static int multiNum(List<Integer> listOfValues){
        //roam values | for(Integer i:listOfValues)
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result *= listOfValues.get(i);
        }
        return result;
    }


}
