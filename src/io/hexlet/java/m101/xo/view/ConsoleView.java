package io.hexlet.java.m101.xo.view;

import io.hexlet.java.m101.xo.controller.Game;

public class ConsoleView {
    protected final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getGameName());
    }

    public void showPlayerName() {
        System.out.println(game.getPlayers());
    }

}
