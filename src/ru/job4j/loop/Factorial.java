package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for(int a = 1; a <= n; a++){
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        int t = Factorial.calc(5);
        System.out.println(t);
    }

}
