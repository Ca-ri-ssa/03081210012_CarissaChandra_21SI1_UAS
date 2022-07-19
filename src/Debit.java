public class Debit extends Pembayaran{
    
    double harga;
    double diskon;

    public Debit(double harga, double diskon) 
    {
        this.harga = harga;
        this.diskon = diskon;
    }

    double Metodebyr(double harga, double diskon){
        //Deskripsi: metode ini berasal dari class Pembayaran dan berfungsi untuk melakukan pembayaran.
        return harga;
    }
    
    /*@Override
    public double MetodeByr() {
        return (harga = harga - (harga*diskon) + (harga*diskon));
    }*/
}