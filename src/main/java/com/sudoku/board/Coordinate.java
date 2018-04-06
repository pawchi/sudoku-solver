package com.sudoku.board;

public class Coordinate {
    public Integer coRow;
    public Integer coCol;

    public Coordinate(Integer coRow, Integer coCol) {
        this.coRow = coRow;
        this.coCol = coCol;
    }

    public Integer getCoRow() {
        return coRow;
    }

    public void setCoRow(Integer coRow) {
        this.coRow = coRow;
    }

    public Integer getCoCol() {
        return coCol;
    }

    public void setCoCol(Integer coCol) {
        this.coCol = coCol;
    }


}
