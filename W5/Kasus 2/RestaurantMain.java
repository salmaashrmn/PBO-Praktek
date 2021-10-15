import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        Scanner keyboard = new Scanner(System.in);
        String makanan;
        int pesanan;
 
        System.out.println("==========================");
        System.out.println("\t  Menu");
        System.out.println("==========================");
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println("==========================");
        
        
        System.out.println("Masukkan pesanan: ");
        makanan=keyboard.nextLine();
        System.out.println("Masukkan jumlah pesanan: ");
        pesanan=keyboard.nextInt();
        menu.Pemesanan(makanan,pesanan);

    }
}