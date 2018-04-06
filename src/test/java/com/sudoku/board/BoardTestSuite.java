package com.sudoku.board;

import org.junit.Test;

public class BoardTestSuite {

    @Test
    public void testNewBoard(){
        SudokuBoard sb = new SudokuBoard();
        sb.setElement(0,3,2);
        sb.setElement(0,8,3);
        sb.setElement(1,1,7);
        sb.setElement(1,4,9);
        sb.setElement(1,6,2);
        sb.setElement(2,1,6);
        sb.setElement(2,2,1);
        sb.setElement(2,3,5);
        sb.setElement(2,4,8);
        sb.setElement(2,7,4);
        sb.setElement(2,8,9);
        sb.setElement(3,0,8);
        sb.setElement(3,5,4);
        sb.setElement(3,8,1);
        sb.setElement(5,0,7);
        sb.setElement(5,3,8);
        sb.setElement(5,8,4);
        sb.setElement(6,0,5);
        sb.setElement(6,1,9);
        sb.setElement(6,4,7);
        sb.setElement(6,5,8);
        sb.setElement(6,6,3);
        sb.setElement(6,7,1);
        sb.setElement(7,2,4);
        sb.setElement(7,4,3);
        sb.setElement(7,7,5);
        sb.setElement(8,0,6);
        sb.setElement(8,5,1);
        System.out.println(sb.getElement(0,3));
    }
}
