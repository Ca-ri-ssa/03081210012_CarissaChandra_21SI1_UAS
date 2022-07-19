//Name       : Carissa Chandra
//Student ID : 03081210012    
//Penjelasan : adanya penambahan sub class untuk soal no.2
public class Mbanking extends Pembayaran{
    int harga;
    int diskon;

    public Mbanking(int harga, int diskon){
        this.harga = harga;
        this.diskon = diskon;
    }
    double Metodebyr(double harga, double diskon){
        //Deskripsi: metode ini berasal dari class Pembayaran dan berfungsi untuk melakukan pembayaran.
        return harga;
        
    }

    /*@Override
    public double MetodeByr() {
        return (harga = harga - 2 * diskon);
    }*/
}
