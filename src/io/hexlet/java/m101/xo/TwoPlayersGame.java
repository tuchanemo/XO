package io.hexlet.java.m101.xo;

public class TwoPlayersGame extends Game {
    private final String player1Name;
    private final String player2Name;

    public TwoPlayersGame(final String player1Name, final String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    public void PrintPlayer1Name() {
        System.out.println(this.player1Name);

    }
    public void PrintPlayer2Name() {
        System.out.println(this.player2Name);

    }
}
