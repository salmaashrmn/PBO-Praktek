/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import java.util.*;

public class Berhitung {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for(;;){
        String operasi = keyboard.nextLine();
        String[] arr = operasi.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        switch(arr[1]){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
        }
        }
    }
}
