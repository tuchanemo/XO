package io.hexlet.java.m101.xo;

public class Game {

    private static String GAME_NAME = "XO";

    private Player[] players;

    public void printGameName() {
        System.out.println(Game.GAME_NAME);
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

}
