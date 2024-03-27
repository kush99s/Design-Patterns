import Model.TicTacToe;

public class Main {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
        game.newGame();
        System.out.println("game winner is: " + game.startGame());

	}

}
