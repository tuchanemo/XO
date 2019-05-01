package io.hexlet.java.m101.xo.model;

public class Figure {

    private final String figure;

    public Figure(final String figure) {
        // BEGIN
        assert figure != null;
        //END
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return this.figure;
    }
}
