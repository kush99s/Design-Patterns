import java.util.concurrent.ThreadLocalRandom;

public class Board {

	Cell [][]cell;
	public Board(int size,int numberSnakes, int numberLadders) {
		initialiseCell(size);
		addSnakesLadders(cell, numberSnakes, numberLadders);
	}
	
	private void initialiseCell(int boardSize) {
		cell = new Cell[boardSize][boardSize];
		
		for(int i=0;i<boardSize;i++) {
            for(int j=0; j<boardSize;j++) {
                Cell cellObj = new Cell();
                cell[i][j] = cellObj;
            }
        }
	}
	
	public void addSnakesLadders(Cell[][] cells,int numberSnakes,int numberLadders) {
		
		while(numberSnakes > 0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
	           int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
	           if(snakeTail >= snakeHead) {
	               continue;
	           }
	           
	           Jumper snakeObj=new Jumper(snakeHead,snakeTail);
	           Cell cell = getCell(snakeHead);
	           cell.jump = snakeObj;
	           numberSnakes--;

		}
		
		while(numberLadders > 0) {
			int ladderHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
	           int ladderTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
	           if(ladderTail >= ladderHead) {
	               continue;
	           }
	           
	           Jumper snakeObj=new Jumper(ladderHead,ladderTail);
	           Cell cell = getCell(ladderHead);
	           cell.jump = snakeObj;
	           numberLadders--;

		}
	}
	
	Cell getCell(int position) {
        int boardRow = position / cell.length;
        int boardColumn = (position % cell.length);
        return cell[boardRow][boardColumn];
    }
}
