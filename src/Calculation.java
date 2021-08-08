import java.util.List;

public class Calculation {
//Pq RESULT=0 não pode ser uma variável global? --LEO

    static int sortList(List<Integer> listOfValues){
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            for (int j = 0; j < sizeList; j++){
                if (listOfValues.get(i) > listOfValues.get(i+1)){

                    result  = listOfValues.get(j);
                    listOfValues.get(j) = listOfValues.get(j+1);
                    listOfValues.get(j+1) = result;

                    //Me explica esse parâmetro SET? --LEO
                    //listOfValues.set(j, listOfValues.get(j+1));
                    //listOfValues.set(listOfValues.get(j+1),result);
                }

            }
        }
        return result;


    }

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

            result = result + ((listOfValues.get(i) + (-1)));
            //result += listOfValues.get(i);
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

        //multiplação está retornando zero
        /*    if(listOfValues.get(i) === 0){

            }*/
        }


        return result;
    }


}
