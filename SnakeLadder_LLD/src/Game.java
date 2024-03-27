import java.util.Deque;
import java.util.LinkedList;

public class Game {

	Board board;
	Dice dice;
	Deque<Player> playerList=new LinkedList<>();
	Player winner;
	
	
	public Game() {
		initialiseGame();
	}
	
	private void initialiseGame() {
		
		board = new Board(10,5,4);
		dice = new Dice(1);
		winner = null;
		Player player1= new Player("Player 1",0);
		Player player2= new Player("Player 2",0);
		playerList.add(player1);
		playerList.add(player2);
		
	}
	
	public void startGame() {
		while(winner==null) {
			Player curr=playerList.removeFirst();
			playerList.add(curr);
			
			System.out.println("player turn is:" + curr.id + " current position is: " + curr.currentPosition);
			 
			int nextPos = curr.currentPosition+ dice.rollDice();
			
			nextPos = jumpCheck(nextPos);
			curr.currentPosition = nextPos;
			
			System.out.println("player turn is:" + curr.id + " new Position is: " + nextPos);
			
			if(nextPos >= board.cell.length * board.cell.length-1) {
				winner = curr;
				continue;
			}
			
		}
		System.out.println("Winner is:" + winner.id);
	}
	
	private int jumpCheck(int nextPos) {
		if(nextPos >= board.cell.length * board.cell.length-1) {
			return nextPos;
		}
		
		Cell cell = board.getCell(nextPos);
		if(cell.jump!=null && cell.jump.start==nextPos) {
			String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
			System.out.println("Jumped by "+ jumpBy );
			nextPos=cell.jump.end;
		}
		
		return nextPos;
		
	}

}
