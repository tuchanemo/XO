package io.hexlet.java.m101.xo;

public class Main {
    public static void main(String[] args) {
        final Game game = new Game();
        game.printGameName();

        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("Slava", "Max");
        twoPlayersGame.PrintPlayer1Name();
        twoPlayersGame.PrintPlayer2Name();
        twoPlayersGame.printGameName();

        final TreePlayersGame treePlayersGame=new TreePlayersGame("Slava","Max","Oleg");
        treePlayersGame.PrintPlayer1Name();
        treePlayersGame.PrintPlayer2Name();
        treePlayersGame.PrintPlayer3Name();
        treePlayersGame.printGameName();
    }

//    private static void printGameNameAndBoard(final Game game, final Board board) {
//        game.printGameName();
//        board.printBoard();

//    }
}
