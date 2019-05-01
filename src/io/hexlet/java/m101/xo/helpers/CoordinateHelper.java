package io.hexlet.java.m101.xo.helpers;

public class CoordinateHelper {

    public CoordinateHelper() {
    }

    private static final int PLAYERS_COUNT = 2;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 2;

    public static boolean checkCoordinate(final int coordinate) {

        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) {
            return false;
        }

        return true;

    }



}
