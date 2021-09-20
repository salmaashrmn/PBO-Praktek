/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma aulia suherman
 */

//62 menit
import java.util.*;
import java.io.*;

public class DataTypes {
    public static void main(String[] args){
        
        int t, n, i;
     
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Jumlah sample yang akan di check: ");
        t = keyboard.nextInt();
        
        for (i=0 ; i< t ; i++){
            try{
                n = keyboard.nextInt();
                System.out.println(n+" can be fitted in:");
                    if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) System.out.println("* byte");
                    if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) System.out.println("* short");
                    if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) System.out.println("* int");
                    if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(keyboard.next()+" can’t be fitted anywhere.");
            }
        }
    }
}
