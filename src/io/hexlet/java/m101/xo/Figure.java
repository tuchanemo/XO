package io.hexlet.java.m101.xo;

public class Figure {
    private final Figure figure;

    public Figure(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }
}
