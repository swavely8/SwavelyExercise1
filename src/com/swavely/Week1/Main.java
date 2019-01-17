package com.swavely.Week1;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        String city = "Columbus";
        int zip = 43125;
        int highs[] = {32, 25, 27, 40, 45};
        float sum = 0;
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zip);
        for(i = 0; i<5; i++) {
            sum = sum + highs[i];
        }
        float avgHigh = sum/i;
        System.out.println("Average High Temperature: " + avgHigh);
    }
}
