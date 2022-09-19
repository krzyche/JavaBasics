package org.kester.section_8.chess;

import org.kester.section_8.Alphabet;

public class Chess {

    private int getLetterOrdinal(String input) {
        String letter = input.strip().toLowerCase();
        int index = Alphabet.valueOf(letter).ordinal();
        return index;
    }
    private int changeNumber(int num) {
        return Math.abs(num-8);
    }

    public String convertNotation(String input){
        int result_1 = getLetterOrdinal(input.substring(0,1));
        int result_2 = changeNumber(Integer.parseInt(input.substring(1,2)));
        String response = result_1 + "," + result_2;
        return response;
    }

    public void createPiece(String coordinates, ChessBoard chessBoard, String pieceName){
        String stringCord = convertNotation(coordinates);
        int row =Integer.parseInt(stringCord.substring(0, 1));
        int col =Integer.parseInt(stringCord.substring(2));
        chessBoard.setChessBoard(pieceName, row, col);
    }


    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        Pawn pawn1 = new Pawn();
        Pawn pawn2 = new Pawn();
        Knight knight1 = new Knight();
        pawn1.createPawn("a3", chessBoard);
        pawn2.createPawn("e6", chessBoard);
        knight1.createKnight("g6", chessBoard);
        chessBoard.showChessBoard();
        System.out.println(chessBoard.getPieceName("g6"));

    }


}
