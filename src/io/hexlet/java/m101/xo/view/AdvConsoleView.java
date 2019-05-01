package io.hexlet.java.m101.xo.view;

import io.hexlet.java.m101.xo.controller.GameController;

public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView (final GameController game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
    }



}
