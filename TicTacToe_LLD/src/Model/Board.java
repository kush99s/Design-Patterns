package Model;

import java.util.*;

public class Board {
	
	
	int size;
	PlayingPiece [][]board;

	public Board(int size) {
		this.size=size;
		board = new PlayingPiece[size][size];
	}
	
	public boolean addPiece(int row,int col,PlayingPiece p) {
		
		if(board[row][col]!=null)	return false;
		board[row][col]=p;
		return true;
	}
	
	public ArrayList<List<Integer>> getFreeCell() {
		ArrayList<List<Integer>> free=new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]==null) {
					List<Integer> rowColumn = new ArrayList<>(i);
					rowColumn.add(j);
					free.add(rowColumn);
				}
			}
		}
		return free;
	}
	
	public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].type.toString() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }
	

}
