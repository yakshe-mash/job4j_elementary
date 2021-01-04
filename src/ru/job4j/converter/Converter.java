package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + "dollar.");

        int inE = 140;
        int expectedE = 2;
        int out = Converter.rubleToEuro(inE);
        boolean passed = expectedE == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inD = 120;
        int expectedD = 2;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
