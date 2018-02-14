package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String inp , inp2;
        int x= 0;
        int loopSize=0;
        int y=0;
        int expo =0;
        int result=0 ;
        int val =0;
        int operation = 0;


        System.out.print("Enter a hexadecimal number: ");
        Scanner input = new Scanner(System.in);
        inp = input.next();

        x = inp.length();
        loopSize = x ;
        y= x-1;

        if (loopSize > 0 && loopSize <= x){
            if(inp.charAt(0) == 0 && inp.charAt(1)== x){
                inp2 = inp.substring(2);
            }
                inp2 = inp;
                char test = inp2.charAt(y);
//-------------------------------------------------------------
                if (inp2.charAt(y)== 'a'){
                    val=10;
                }
                if (inp2.charAt(y)== 'b'){
                     val=11;
                }
                if (inp2.charAt(y)== 'c'){
                     val=12;
                }
                if (inp2.charAt(y)== 'd'){
                     val=13;
                }
                if (inp2.charAt(y)== 'e'){
                    val=14;
                }
                if (inp2.charAt(y)== 'f'){
                    val=15;
                }
            if (inp2.charAt(y) >='0' && inp2.charAt(y) <= '9'){
                val=inp2.charAt(y) - 48;
            }
//----------------------------------------------------------------
            operation = Math.pow(  val , expo );
            result = result + operation;

            expo++;
                y--;
                loopSize--;

        }
        System.out.println("Your number is "+result+" in decimal");




    }
}
