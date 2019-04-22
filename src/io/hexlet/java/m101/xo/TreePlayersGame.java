package io.hexlet.java.m101.xo;

public class TreePlayersGame extends TwoPlayersGame {

    private final String player3Name;

    public TreePlayersGame(final String player1Name, final String player2Name, final String player3Name) {
        super(player1Name, player2Name);
        this.player3Name = player3Name;
    }

    public void PrintPlayer3Name() {
        System.out.println(this.player3Name);

    }
}
