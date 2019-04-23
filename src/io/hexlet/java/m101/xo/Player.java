package io.hexlet.java.m101.xo;

public class Player {
    public Player(final String name, final String figure) {
        this.name = name;
        this.figure = figure;
    }

    private final String name;

    private final String figure;

    public String getName() {
        return name;
    }
}
