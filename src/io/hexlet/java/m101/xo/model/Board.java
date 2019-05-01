package io.hexlet.java.m101.xo.model;

import java.util.Arrays;

public class Board {

    private static final int SIZE_FIELD = 3;

    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray() {

        figures[0][0] = new Figure("O");
        figures[1][1] = new Figure("X");
    }

    public void showBoard() {

        System.out.println(Arrays.deepToString(this.figures));

    }

}
