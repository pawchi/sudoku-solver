package com.sudoku.board;

import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> cols = new ArrayList<>();

    public ArrayList<SudokuElement> getCols() {
        return cols;
    }

    public SudokuRow() {
        for (int n=0; n<9;n++){
            cols.add(new SudokuElement());
        }
    }
}
