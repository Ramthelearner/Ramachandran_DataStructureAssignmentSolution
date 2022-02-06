package com.greatlearning.construction;

public class Main {
	public static int totalFloors;
    public static int[] totalFloorSize;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Construction myDriverObj = new Construction();
        myDriverObj.getInputs();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
}
