package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = rsl == 0 ? Math.abs(x2 - x1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int elphnt = ChessBoard.way(7, 7, 2, 2);
        System.out.println(elphnt);
    }
}