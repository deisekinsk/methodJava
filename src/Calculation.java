import java.util.List;

public class Calculation {

/*    static int sortList(List<Integer> listOfValues){
        int result = 0;
        int changePosition = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            for (int j = 0; j < sizeList; j++){
                if (listOfValues.get(i) > listOfValues.get(i+1)){
                    result = listOfValues.get(j);
                    changePosition = listOfValues.get(j+1);

                    changePosition = result;


                    //Me explica esse parâmetro SET? --LEO
                    //listOfValues.set(j, listOfValues.get(j+1));
                    //listOfValues.set(listOfValues.get(j+1),result);
                }

            }
        }
        return result;
    }*/


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

        for(int i =  sizeList; i >= 0; i--){
            result = listOfValues.get(i);


        }
        return result;

    }

    static double divisionNum(double val1, double val2){
        double result = 0;

        if (val1 != 0 && val2 != 0){
            if(val1 > val2){
                result = val1 /val2;
            }else{
                result = val2 / val1;
            }
        } else {
            result = 0.001;
        }

        return result;
    }

 
    static int multiNum(List<Integer> listOfValues){
        int result = 1;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result *= listOfValues.get(i);
        }

        if (result == 1) {
            return 0;
        }else{
            return result;
            }
        }

    }
