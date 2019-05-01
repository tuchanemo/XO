package io.hexlet.java.m101.xo;

import io.hexlet.java.m101.xo.controller.GameController;
import io.hexlet.java.m101.xo.model.Board;
import io.hexlet.java.m101.xo.model.Figure;
import io.hexlet.java.m101.xo.model.Player;
import io.hexlet.java.m101.xo.view.AdvConsoleView;
import io.hexlet.java.m101.xo.view.ConsoleView;


public class Main {
    public static void main(String[] args) {

//        testBoard();
//        testFigure();
//        testGameController();
//        testPlayer();
//        testConsoleView();

        Board board = new Board();
        board.initArray();
        board.showBoard();

    }

    private static void testConsoleView() {

        final GameController gameController = new GameController("XO");
        final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
        final ConsoleView consoleView = new ConsoleView(gameController);
        startGame(advConsoleView);
        startGame(consoleView);

        try {
            new ConsoleView(null);
            throw new RuntimeException("assert is not working as expected");
        } catch (AssertionError e){}

        try {
            new AdvConsoleView(null);
            throw new RuntimeException("assert is not working as expected");
        } catch (AssertionError e){}

    }

    private static void testFigure() {
        final String figureName = "A";
        final Figure figure = new Figure(figureName);
        if (!figure.getFigure().equals(figureName)) {
            throw new RuntimeException("Figure test falure");
        }

        try {
            new Figure(null);
            throw new RuntimeException("assert is not working as expected");
        } catch (AssertionError e) {}

    }

    private static void testPlayer() {
        final String playerName = "Max";
        final Figure playerFigure = new Figure("A");
        final Player player = new Player(playerName, playerFigure);
        if (!player.getFigure().equals(playerFigure) || !player.getName().equals(playerName)) {
            throw new RuntimeException("Player test falure");
        }

        try {
            new Player(null,playerFigure);
            throw new RuntimeException("assert is not working as expected");
        } catch (AssertionError e) {}

        try {
            new Player(playerName,null);
            throw new RuntimeException("assert is not working as expected");
        } catch (AssertionError e) {}
    }

    private static void testBoard() {

        final Board board = new Board();
    }

    private static void testGameController() {

        final String gameName = "XO";
        final GameController gameController = new GameController(gameName);
        if (!gameController.getGameName().equals(gameName)) {
            throw new RuntimeException("GameController test falure");
        }
        gameController.move(0, 0);
        gameController.currentPlayer();
    }

    private static void startGame(final ConsoleView consoleView) {

        consoleView.showGameName();
        consoleView.showPlayersName();

    }

}
