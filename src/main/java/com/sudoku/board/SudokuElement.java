package com.sudoku.board;

import java.util.*;

public class SudokuElement {
    private int value;
    public final static int EMPTY = -1;
    private Set<Integer> possibleValues = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public int getValue() {
        return value;
    }

    public Set<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void removePossibleValue(int value) {
        possibleValues.remove(value);
    }

    public SudokuElement() {
        value = EMPTY;
    }

    public Integer getElementFromPossibleValues() {
        int a = 0;
        for (Integer x : possibleValues) {
            a = x;
        }
        return a;
    }
}
