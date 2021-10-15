
public class Restaurant {
    private makanan[] menuMakanan;
    private static byte id=0;

    public Restaurant() {
	menuMakanan = new makanan[10];
    }
		
    public void tampilMenuMakanan()
    {
	for(int i = 0; i <= id; i++)
	{
            if(!isOutOfStock(i))
            {
		this.menuMakanan[i].TampilMakanan();
            }	
	}
    }
		
    public void tambahMenuMakanan(String nama, double harga, int stok) {
	this.menuMakanan[id] = new makanan (nama, harga, stok);
    }	
		
    public boolean isOutOfStock(int id){	
	return menuMakanan[id].getStok() == 0;
    }
		
    public static void nextId(){
	id++;
    }
		
    public void Pemesanan (String namaMakanan, int jumlah)
    {
	for (int i = 0 ; i <= id; i++)
	{
            if(namaMakanan.equals(menuMakanan[i].getNama_makanan()))
            {
                if(menuMakanan[i].getStok() >= jumlah)
                {
                    System.out.println(jumlah + " " + menuMakanan[i].getNama_makanan() + " " + "Terjual!");
                    menuMakanan[i].kurangStok(jumlah);
                    System.out.println("Sisa stok "+menuMakanan[i].getNama_makanan()+" yang tersedia: "+menuMakanan[i].getStok());
                }
                else System.out.println("Stok" + menuMakanan[i].getNama_makanan() + "tidak cukup !");
            }
	}
    }
}
