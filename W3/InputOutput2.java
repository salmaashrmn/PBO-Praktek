/*
 * Nama: Salma Aulia Suherman
 * NIM: 201511060
 * Kelas: D32B Teknik Informatika
 * 
 */

package inputoutput;

import java.util.*;
        
public class InputOutput2 {
    public static void main(String[] args){
        String[] line;
        line = new String[3];
        Scanner keyboard = new Scanner(System.in);
        
        line[0]= keyboard.nextLine();
        line[1]= keyboard.nextLine();
        line[2]= keyboard.nextLine();
        
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String[] arr = line[i].split(" ");
            for (int j=0; j < arr.length;){
                System.out.printf("%-15s", arr[j]);
                System.out.printf("%03d\n", Integer.parseInt(arr[j+1]));
                j=j+2;
            }
        }
        System.out.println("================================");  
    }
}
//55 menit