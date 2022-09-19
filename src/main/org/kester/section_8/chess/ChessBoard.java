package org.kester.section_8.chess;

public class ChessBoard extends Chess{

    private String[][] chessBoard = new String[8][8];

    public void showChessBoard() {
        for (int col=0; col<8; col++) {
            for (int row = 0; row < 8; row++) {
                if (chessBoard[row][col] == null) {
                    chessBoard[row][col]= "----";
                }
                System.out.printf("[%s] ", chessBoard[row][col]);
            }
            System.out.println("");
        }
    }

    public void setChessBoard(String pieceName, int row, int col) {
        this.chessBoard[row][col] = pieceName;
    }

    public String getPieceName(String coordinates){
        String cords = convertNotation(coordinates);
        int row = Integer.parseInt(cords.substring(0,1));
        int col = Integer.parseInt(cords.substring(2));
        return chessBoard[row][col];

    }

}



