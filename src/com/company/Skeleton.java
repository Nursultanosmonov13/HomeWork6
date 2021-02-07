package com.company;

public class Skeleton extends Boss {


    private int numberOfArrows = 12;
    private int a = 7;
    private String shine;
    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public String printInfo() {
        return super.printInfo()+ "количество стрел:" + numberOfArrows + ", количество потронов " + 7;
    }
}
