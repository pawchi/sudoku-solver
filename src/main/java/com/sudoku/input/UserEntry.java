package com.sudoku.input;

public class UserEntry {
    public static final String SUDOKU = "SUDOKU";
    public static final String EXIT = "EXIT";
    public static final String VALUE = "VALUE";
    public static final String ERROR = "ERROR";
    public static final String EXAMPLE = "EXAMPLE";

    private String type;
    private int row;
    private int col;
    private int value;

    public UserEntry(String type, int row, int col, int value) {
        this.type = type;
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getValue() {
        return value;
    }
}
