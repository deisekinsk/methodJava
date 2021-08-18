package module.operations.interfaces.impl;


import module.operations.interfaces.BasicOperations;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Calculation implements BasicOperations {

    @Override
    public List<Integer> sortList(List<Integer> listOfValues){
        int result = 0;
        int sizeList = listOfValues.size();
        //convert to array
        Integer arrayList [] = new Integer[sizeList];
        for(int i = 0; i < sizeList; i++){
            arrayList[i] = listOfValues.get(i);
        }
        //sort
        for(int i = 0; i < sizeList; i++){
            for (int j = 0; j < sizeList - 1; j++){
                //swap
                if(arrayList[j] > arrayList[j+1]){
                    result = arrayList[j];
                    arrayList[j]=arrayList[j+1];
                    arrayList[j+1]=result;
                }
            }
        }
        //convert to List
        List<Integer> resultA = Arrays.asList(arrayList);
        return resultA;
    }

    @Override
    public int sumNum(List<Integer> listOfValues) {
        //roam values | for(Integer i:listOfValues)
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i = 0; i < sizeList; i++){
            result += listOfValues.get(i);
        }
        return result;
    }

    @Override
    public int decreaseNum(List<Integer> listOfValues){
        int result = 0;
        int sizeList = listOfValues.size();

        for(int i =  0; i < sizeList; i++){
            if(result != 0){
                result = result - listOfValues.get(i);// 5-2/ 0
            }else{
                result = listOfValues.get(i);// 5-2/ 0
            }
        }
        return result;
    }

    @Override
    public double divisionNum(double val1, double val2){
        double result = 0;

        try {
        result = val1 /val2;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Insert a number != 0." + e.getMessage());
        }finally {
            JOptionPane.showMessageDialog(null,"Thank you.");
        }
        return result;
    }

    @Override
    public int multiNum(List<Integer> listOfValues){
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

    @Override
    public double meanNum(List<Integer> listOfValues) {
        return 0;
    }

}
