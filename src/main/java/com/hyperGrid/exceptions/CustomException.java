package com.hyperGrid.exceptions;

public class CustomException {

    public static void main(String[] args) {
        String s = null;
        try{
            if(s.length() ==  0){
                throw new HyperGridException();
            }
        } catch (HyperGridException e) {
            throw new RuntimeException(e);
        }
    }
}