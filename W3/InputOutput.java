/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
 */

package inputoutput;

import java.util.*;     //memberi program seluruh akses class yang ada pada package java.util

public class InputOutput {
    public static void main(String[] args){
        String kalimat;     //deklarasi variabel
        Scanner keyboard = new Scanner(System.in);      //untuk melakukan scan input dari keyboard
        
        kalimat = keyboard.nextLine();                  //input kalimat
        StringTokenizer st = new StringTokenizer(kalimat," !,?._'@");       //untuk memecah string menjadi beberapa kata berdasarkan delimiter
        System.out.println(st.countTokens());           //menampilkan jumlah kata/token dari hasil pemecahan string 
        while(st.hasMoreTokens()){                      //hasMoreTokens adalah method untuk mengecek apakah masih ada token yang tersedia
            System.out.println(st.nextToken());         //menampilkan token
        }
        
    }
}
