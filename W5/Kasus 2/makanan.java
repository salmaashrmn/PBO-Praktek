public class makanan{
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public makanan(String nama, double harga, int stok) {
        this. nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = stok;
    }
    
    public String getNama_makanan() {
        return nama_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void kurangStok(int stok) {
        this.stok -= stok;
    }
    
    public void TampilMakanan(){
        System.out.println(nama_makanan +"["+stok+"]"+"\tRp. "+harga_makanan);
    }
}