package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean a : data) {
            boolean b = data[data.length - 1];
            if (a != b) {
                result = false;
                break;
            }
        }
        return result;
    }
}
