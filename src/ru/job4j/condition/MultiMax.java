package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second ) {
            result = first;
        } else {
            result = second;
        }
        if (result < third) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int comparing = MultiMax.max(4, 6, 9);
        System.out.println(comparing);
    }
}
