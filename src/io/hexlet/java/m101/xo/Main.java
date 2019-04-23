package io.hexlet.java.m101.xo;

public class Main {
    public static void main(String[] args) {

        final Board board = new Board();

        final Game game = new Game();

        game.printGameName();

//        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("Slava", "Max");
//        twoPlayersGame.PrintPlayer1Name();
//        twoPlayersGame.PrintPlayer2Name();
//        twoPlayersGame.printGameName();

//        final TreePlayersGame treePlayersGame = new TreePlayersGame("Slava", "Max", "Oleg");
//        treePlayersGame.PrintPlayer1Name();
//        treePlayersGame.PrintPlayer2Name();
//        treePlayersGame.PrintPlayer3Name();
//        treePlayersGame.printGameName();

        printGameNameAndBoard(game, board);
    }

    private static void printGameNameAndBoard(final Game game, final Board board) {
        game.printGameName();
        System.out.println("====================================");
        board.printBoard();

    }
}
