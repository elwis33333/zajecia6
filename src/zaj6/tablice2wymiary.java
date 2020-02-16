package zaj6;

import java.util.Random;

public class tablice2wymiary {
    public static void main(String[] args) {
        final int rowWidth = 9;
        final int colHeight = 9;
        //create the grid
        int[][] board = getRandomTable(rowWidth, colHeight);
        //display output
        displayTable(board);
        System.out.println();
        int [][] board2 = cteateTranspositionOFArray(board);
        displayTable(board2);

    }


    private static int[][] getRandomTable(int rowWidth, int colHeight) {
        Random rand = new Random();
        int[][] board = new int[rowWidth][colHeight];
        //fill the grid
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = rand.nextInt(100);
            }
        }
        return board;
    }

    private static void displayTable(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
                //System.out.println();
            }
            System.out.println();
        }
    }

    //metoda transpozycja tablicy/macierzy
    private static int[][] cteateTranspositionOFArray(int[][] board) {
        int[][] board2 = new int[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board2[row][col] = board[col][row];
            }
        }
        return board2;
    }
}