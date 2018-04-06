package com.sudoku.input;

import com.sudoku.board.Coordinate;

import java.util.HashMap;
import java.util.Map;

public class UserInputDb {
    public Map<Coordinate,Integer> sudokuDb = new HashMap<>();

    public void saveSudokuDb(Coordinate coordinate, Integer value){
        sudokuDb.put(coordinate,value);
    }

    public void getElementsValue(Coordinate coordinate){
        sudokuDb.get(coordinate);
    }


}
