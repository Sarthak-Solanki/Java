import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
	public static int row,col,rcount,ccount;
	public static char board[][];
	public static char turn = 'X';
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	
		board =new char [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '_';
			}
		}
		printBoard();
		play();
		
	}
	public static void play() {
		boolean playing = true;
		while(playing) {
			System.out.println();
			System.out.println("Enter row and column");
			row = sc.nextInt()-1;
			col = sc.nextInt()-1;
			if(board[row][col]!='X'&&board[row][col]!='Y'&&board[row][col]=='_') {
			board[row][col] = turn;
			if(gameOver(row, col)) {
				playing = false;
				System.out.println(turn+" wins!!");
			}
			printBoard();
			if(turn == 'X') {
				turn = 'O';
			}
			else
				turn = 'X';
		}
			else
				System.out.println("Valid input");
			}
	}
	public static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board.length; j++) {
				if(j==0) {
					System.out.print("| " );
				}
				System.out.print(board[i][j]+" | ");
			}
		}
	}
	public static boolean gameOver(int rmove,int cmove) {
		if(board[0][cmove]==board[1][cmove]&&board[0][cmove]==board[2][cmove])
		return true;
		if(board[rmove][0]==board[rmove][1]&&board[rmove][0]==board[rmove][2])
			return true;
		if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!='_') {
			return true;
		}
		if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&board[1][1]!='_') {
			return true;
		}
				
			
			return false;
	}
}
