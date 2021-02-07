package com.company;

public class Skeleton extends Boss {


    private int numberOfArrows = 12;
    private int a = 7;
    private int b = 8;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public String printInfo() {
        return super.printInfo() + "количество стрел:" + numberOfArrows + "количестыр потронов " + 7;
    }
}
