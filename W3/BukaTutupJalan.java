/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
 */

package Operators;

import java.util.*;

public class BukaTutupJalan {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        for(;;){
            String plat = keyboard.nextLine();
            plat = plat.replaceAll("\\s","");
            long nomor = Long.parseLong(plat);
        
            if((nomor-999999)%5==0){
                System.out.println("berhenti");
            }else{
                System.out.println("jalan");
            }
        }     
    }
}
