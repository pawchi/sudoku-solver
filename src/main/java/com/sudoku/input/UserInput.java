package com.sudoku.input;
import com.sudoku.board.SudokuBoard;

public class UserInput {

    public boolean inputRetriever() {

        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);

        while (true) {
            UserEntry entry = UserDialogs.getSingleEntry();
            switch (entry.getType()) {
                case UserEntry.ERROR:
                    break;
                case UserEntry.SUDOKU:
                    sudokuBoard.resolveSudoku();
                    System.out.println(sudokuBoard);
                case UserEntry.EXIT:
                    return true;
                case UserEntry.VALUE:
                    sudokuBoard.setElement(entry.getRow(), entry.getCol(), entry.getValue());
                    break;
                case UserEntry.EXAMPLE:
                    InitialInputData initialInputData = new InitialInputData();
                    initialInputData.prepareInitialSudokuBoard(sudokuBoard);
            }
            System.out.println(sudokuBoard);
        }
    }
}
