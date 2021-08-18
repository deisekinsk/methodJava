package module.operations.interfaces;

import java.util.List;

public interface BasicOperations {
    List<Integer> sortList(List<Integer> listOfValues);
    int sumNum(List<Integer> listOfValues);
    int decreaseNum(List<Integer> listOfValues);
    double divisionNum(double val1, double val2);
    int multiNum(List<Integer> listOfValues);
    double meanNum(List<Integer> listOfValues);
}
