/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
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
        if ((a>=1&&a<=1000)&&(b>=1&&b<=1000)){
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
        }else System.out.println("A dan B tidak memenuhi syarat");
        }
    }
}
