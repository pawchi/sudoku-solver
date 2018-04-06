package com.sudoku.input;

import java.util.Scanner;

public class UserDialogs {
    private static final String msg = "Please write coordinates and value in form three digits XYV (f.e.:357, X:0-8, Y:0-8, V:1-9)"+
            "\nor type SUDOKU to resolve or EXIT to exit:";
            public static UserEntry getSingleEntry(){
        Scanner scanner = new Scanner(System.in);
        while (true){
           System.out.println(msg);
           String s=scanner.nextLine();
           if (s.equals(UserEntry.EXIT)){
               return new UserEntry(UserEntry.EXIT,0,0,0);
           }
           if (s.equals(UserEntry.SUDOKU)){
               return new UserEntry(UserEntry.SUDOKU,0,0,0);
           }
           if (s.equals((UserEntry.EXAMPLE))){
               return new UserEntry(UserEntry.EXAMPLE,0,0,0);
           }
           try {
               int row = Integer.parseInt(s.substring(1,2));
               int col = Integer.parseInt(s.substring(0,1));
               int value = Integer.parseInt(s.substring(2,3));
               if (row>8 || col>8 || value<1 || s.length()>3){
                   throw new Exception();
               }
               return new UserEntry(UserEntry.VALUE,row,col,value);
           } catch (Exception e){
               System.out.println("Wrong selection!");
           }
        }
    }
}
