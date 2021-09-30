/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
 */

package Operators;

import java.util.*;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args){
        BigInteger A, B;
        
        Scanner keyboard = new Scanner(System.in);
        
        A = keyboard.nextBigInteger();
        B = keyboard.nextBigInteger();
        
        System.out.println(" ");
        
        BigInteger tambah = A.add(B);
        BigInteger kali = A.multiply(B);
        
        System.out.println(tambah);
        System.out.println(kali);
    }
}
