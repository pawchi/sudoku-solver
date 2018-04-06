package com.sudoku.board;

import java.util.ArrayList;

public class SudokuBoard {
    private ArrayList<SudokuRow> rows = new ArrayList<>();

    public ArrayList<SudokuRow> getRows() {
        return rows;
    }

    public SudokuBoard() {
        for (int n = 0; n < 9; n++) {
            rows.add(new SudokuRow());
        }
    }

    public void setElement(int row, int col, int value) {
        rows.get(row).getCols().get(col).setValue(value);
    }

    public int getElement(int row, int col) {
        return rows.get(row).getCols().get(col).getValue();
    }

    private int squareNumber(int number) {
        return number / 3;
    }

    public void resolveSudoku() {


        int sudokuCompleted = 0;
        int numberOfLoopsToSolve = 0;
        while (sudokuCompleted != 405) {

            int sudokuTemp = 0;
            int noProgresInAllLoops = 0;
            for (SudokuRow row : getRows()) {
                for (SudokuElement element : row.getCols()) {

                    if (element.getValue() == SudokuElement.EMPTY) {
                        int currentRow = getRows().indexOf(row);
                        int currentCol = row.getCols().indexOf(element);

                        //1-check values in row and remove them from possibleValues
                        for (SudokuElement checkElement : row.getCols()) {
                            if (checkElement.getValue() != SudokuElement.EMPTY) {
                                element.removePossibleValue(checkElement.getValue());
                            }
                        }

                        //2-check values in col and remove them from possibleValues
                        for (int rownum = 0; rownum < 9; rownum++) {
                            if (getElement(rownum, row.getCols().indexOf(element)) != SudokuElement.EMPTY) {
                                element.removePossibleValue(getElement(rownum, row.getCols().indexOf(element)));
                            }
                        }

                        //3-check values in 3x3 squere and remove them from possibleValues
                        for (int dx = 0; dx < 3; dx++) {
                            for (int dy = 0; dy < 3; dy++) {
                                element.removePossibleValue(getElement(squareNumber(currentRow) * 3 + dy, squareNumber(currentCol) * 3 + dx));
                            }
                        }

                        //4-if left only one value in possibleValues -> setValue/else -> go to next cell
                        if (element.getPossibleValues().size() == 1) {
                            element.setValue(element.getElementFromPossibleValues());
                        } else {
                            noProgresInAllLoops++;
                        }
                    } else {
                        sudokuTemp += element.getValue();
                        noProgresInAllLoops++;
                    }
                }
            }
            numberOfLoopsToSolve++;

            if (sudokuTemp == 405) {
                sudokuCompleted = 405;
                System.out.println("\nSUDOKU SOLVED SUCCESSFULLY IN " + numberOfLoopsToSolve + " LOOPS!!");
                break;
            }
            if (noProgresInAllLoops == 81) {
                System.err.println("\nYOUR SUDOKU HAS MORE THAN ONE SOLUTION OR ANY VALUE IS IN WRONG PLACE." +
                        "\nIS NOT POSSIBLE TO SOLVE.\n");
                break;
            }
        }
    }


    @Override
    public String toString() {
        String s = "|===|===|===|===|===|===|===|===|===|";
        int rowCount = 0;
        for (SudokuRow row : rows) {
            s += "\n|";
            for (SudokuElement element : row.getCols()) {
                if (element.getValue() == SudokuElement.EMPTY) {
                    s += "   |";
                } else {
                    s += " " + element.getValue() + " |";
                }
            }
            if (rowCount < 9) {
                if (rowCount == 0 || rowCount == 1 || rowCount == 3 || rowCount == 4 || rowCount == 6 || rowCount == 7) {
                    s += "\n|---|---|---|---|---|---|---|---|---|";
                } else {
                    s += "\n|===|===|===|===|===|===|===|===|===|";
                }
            }
            rowCount++;
        }
        return s;
    }
}