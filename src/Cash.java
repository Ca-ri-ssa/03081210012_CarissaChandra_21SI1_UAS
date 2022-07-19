public class Cash extends Pembayaran{
    //Name       : Carissa Chandra
    //Student ID : 03081210012
    //Penjelasan : adanya pergantian penamaan variabel dan perubahan method menjadi overloading method
    int harga;
    int diskon;

    public Cash(int harga, int diskon) 
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
        return (harga = harga - harga * diskon);
    }*/
}