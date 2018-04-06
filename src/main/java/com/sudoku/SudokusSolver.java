package com.sudoku;

import com.sudoku.board.SudokuBoard;
import com.sudoku.board.SudokuElement;
import com.sudoku.board.SudokuRow;
import com.sudoku.input.UserInput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokusSolver {
    SudokuBoard sudokuBoard = new SudokuBoard();

    public void resolveSudoku() {


        for (SudokuRow row : sudokuBoard.getRows()) {

            for (SudokuElement element : row.getCols()) {

                if(element.getValue()== SudokuElement.EMPTY){
                    Set<Integer> possibleValues = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

                    for(int r=0;r<9;r++){
                        System.out.println(sudokuBoard.getRows().get(r).getCols().get(0).getValue());
                    }

                }

            }
        }




    }
}
