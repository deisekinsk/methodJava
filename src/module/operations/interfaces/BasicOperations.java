package module.calculations.interfaces.impl;

import java.util.List;

public interface BasicOperations {
    public List<Integer> sortList(List<Integer> listOfValues);
    public int sumNum(List<Integer> listOfValues);
    public int decreaseNum(List<Integer> listOfValues);
    public double divisionNum(double val1, double val2);
    public int multiNum(List<Integer> listOfValues);
}
