/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * Menentukan tipe data primitif
 */

import java.util.*;     //memberi program seluruh akses class yang ada pada package java.util 

public class DataTypes {
    public static void main(String[] args){
        
        int t, n, i;
     
        Scanner keyboard = new Scanner(System.in);      //untuk melakukan scan input dari keyboard
        
        System.out.println("Jumlah sample yang akan di check: ");
        t = keyboard.nextInt();                         //input jumlah sample yang akan di check
        
        //melakukan perulangan sebanyak t kali 
        for (i=0 ; i< t ; i++){
            try{
                n = keyboard.nextInt();                         //input nilai yang akan di check
                System.out.println(n+" can be fitted in:");     //menampilkan nilai dan keterangan jika memenuhi kondisi if dibawah
                    if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) System.out.println("* byte");        //cek apakah sample memenuhi value tipe data byte
                    if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) System.out.println("* short");     //cek apakah sample memenuhi value tipe data short
                    if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) System.out.println("* int");   //cek apakah sample memenuhi value tipe data int
                    if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)System.out.println("* long");         //cek apakah sample memenuhi value tipe data long
            }
            catch(Exception e) {
                System.out.println(keyboard.next()+" can't be fitted anywhere.");   //menampilkan nilai dan keterangan jika tidak memenuhi kondisi if dibawah
            }
        }
    }
}
