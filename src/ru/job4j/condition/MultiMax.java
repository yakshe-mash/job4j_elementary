package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second && first > third) result = first;
        if (first < second && second > third) result = second;
        else
            result = third;

        return result;
    }
}