package io.hexlet.java.m101.xo.view;

import io.hexlet.java.m101.xo.controller.GameController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    protected final GameController gameController;

    private final static Scanner IN = new Scanner(System.in);

    public ConsoleView(final GameController gameController) {

        assert gameController != null;
        this.gameController = gameController;
    }

    public void showGameName() {
        System.out.println(gameController.getGameName());
    }

    public void showPlayersName() {
        System.out.println(gameController.getPlayers());
    }

    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            showBoardLine(i);
        }
    }

    private void showBoardLine(int row) {
        for (int i = 0; i < 3; i++) {
            System.out.print(gameController.getBoard().getFigure(row, i));
        }
    }

    private int getCoordinate(final String coordinateName) {

        System.out.println(String.format("Input the coordinate %s: ", coordinateName));

        try {
            return IN.nextInt();
        } catch (final InputMismatchException e) {
            System.out.println("Coordinate is incorrect");
            return -1;
        }
    }

}
