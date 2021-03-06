package io.hexlet.java.m101.xo.model;

public class Player {

    private final String name;

    private final Figure figure;

    public Player(final String name, final Figure figure) {

        // BEGIN
        assert name != null;
        assert figure != null;
        // END

        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
