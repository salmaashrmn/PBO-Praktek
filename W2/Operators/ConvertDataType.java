
package Operators;

class ConvertDataType{
    static short methodOne(long l){
        int i = (int) l;        //mengconvert nilai l yang memiliki tipe data long menjadi int
        return (short)i;        //mereturn nilai i yang diconvert terlebih dahulu dari int menjadi short        
    }

    public static void main(String[] args){
        double d = 10.25;                    //deklarasi variabel d dengan tipe data double
        float f = (float) d;                 //mengconvert nilai d yang memiliki tipe data double menjadi float
        byte b = (byte) methodOne((long) f); //memanggil method methodOne dengan parameter f yang diconvert terlebih dahulu dari float menjadi long
                                             //hasil return methodOne diconvert dari tipe data int menjadi byte lalu disimpan di variabel b
        System.out.println(b);               //menampilkan nilai b 
    }
}
