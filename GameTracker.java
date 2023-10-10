/**
 * @author Roberto Lopez
 */

package edu.angelo.midtermprojectlopez;

import java.util.Scanner;

public class GameTracker {

    private final int numRows;
    private final int numColumns;
    private int[][] mainBoard;

    //fix this we trying to intialize the board
    public GameTracker(int numRows, int numColumns){

        this.numRows = numRows;
        this.numColumns = numColumns;
        mainBoard = new int[numRows][numColumns];

    }

    public static int[] minimax(char[][] board, char player) {
        //TODO: Implement the Minimax algorithm here
        //you will need to create a recursive function to search for the best move
        //and return the row and column of that move
        return new int[] { 0, 0 }; //placeholder replace with actual logic
    }


    public static void printBoard(char[][] board) {

        System.out.println("  0 1 2");

        for (int i = 0; i < 3; i++) {

            System.out.print(i + " ");

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");

            }

            System.out.println();
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {

        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static boolean isGameWon(char[][] board, char player) {

        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {

                return true;

            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {

            return true;

        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {

            return true;

        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {

                    return false;

                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        GameTracker board = new GameTracker(3,3);

        //find out whos turn is it


    /**
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameWon = false;

        printBoard(board);

        while (true) {

            if (currentPlayer == 'X') {

                System.out.println("Player X enter row (0-2) and column (0-2):");

                int row, col;
                Scanner scanner = new Scanner(System.in);

                while (true) {

                    row = scanner.nextInt();
                    col = scanner.nextInt();

                    if (isValidMove(board, row, col)) {

                        break;

                    } else {

                        System.out.println("Invalid move try again");
                    }
                }

                board[row][col] = currentPlayer;

            } else {

                //ai's turn (Player O)
                int[] bestMove = minimax(board, 'O');
                int row = bestMove[0];
                int col = bestMove[1];
                System.out.println("Player O chooses row " + row + " and column " + col);
                board[row][col] = currentPlayer;

            }

            printBoard(board);

            if (isGameWon(board, currentPlayer)) {

                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;

            } else if (isBoardFull(board)) {

                System.out.println("It's a draw!");
                break;

            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        **/
    }
}
