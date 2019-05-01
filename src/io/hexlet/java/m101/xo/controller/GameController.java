package io.hexlet.java.m101.xo.controller;

import io.hexlet.java.m101.xo.helpers.CoordinateHelper;
import io.hexlet.java.m101.xo.model.Board;
import io.hexlet.java.m101.xo.model.Figure;
import io.hexlet.java.m101.xo.model.Player;

public class GameController {

    private final String gameName;

    private final Board board;

    private final Player[] players;

    public GameController(final String gameName, final Player[] players, final Board board) {
        this.board=board;
        this.players=players;
        if (gameName==null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName=gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Board getBoard() {
        return board;
    }

    public boolean move(final int x, final int y) {

        assert x >= 0;
        assert y >= 0;

        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
            return false;
        }

        // TODO for logic move
        return true;
    }

    public Player[] getPlayers() {
        return players;
    }

}
