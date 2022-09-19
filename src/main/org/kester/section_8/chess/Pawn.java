package org.kester.section_8.chess;

public class Pawn extends Chess {

    public void createPawn(String coordinates, ChessBoard chessBoard){
        createPiece(coordinates, chessBoard, "Pawn");
    }

    public String howCanIMove(String coordinates, ChessBoard chessBoard){
        String pieceName = chessBoard.getPieceName(coordinates);

    }

}
