package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class clas = new Class(123, "soz", new int[]{23, 34, 45, 56, 78});
        System.out.println(clas.getNumber()+" "+clas.getWord()+" "+Arrays.toString(clas.getArray()));
        }
}
