/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
 */

package Operators;

import java.util.*;

public class GajiAgent {
    public static void main(String[] args){
        int penjualan, totalPenjualan, bonus, gaji, minus;
        
        Scanner keyboard = new Scanner (System.in);
        
        for(;;){
        penjualan = keyboard.nextInt();
        if(penjualan>=40){
            totalPenjualan = 50000*penjualan;
            bonus = (int) 0.25*totalPenjualan;
            gaji = 500000+bonus;
        }else if(penjualan>80){
            totalPenjualan = 50000*penjualan;
            bonus = (int) 0.35*totalPenjualan;
            gaji = 500000+bonus;
        }else if(penjualan<15){
            penjualan = 15-penjualan;
            minus = (int) (0.15*50000)*penjualan;
            gaji = 500000-minus;
        }else{
            bonus = (int) (0.10*50000)*penjualan;
            gaji = 500000+bonus;
        }
        System.out.println(gaji);
        }
    }
}
