/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduzca un número:");
        String cond=" ";
        num = in.nextInt();
        if (num%2==0){
            cond="par";
        }
        else{cond="impar";
        }
        
        System.out.println("El número es: "+cond);
        }
        
        
    }

