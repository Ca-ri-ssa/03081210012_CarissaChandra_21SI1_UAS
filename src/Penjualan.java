public class Penjualan {
    String IDPenjualan;
    String Tanggal;
    String IDPetugas;



    public Penjualan() {
    }

    public Penjualan(String IDPenjualan, String Tanggal, String IDPetugas) {
        this.IDPenjualan = IDPenjualan;
        this.Tanggal = Tanggal;
        this.IDPetugas = IDPetugas;
    }

    public String getIDPenjualan() {
        //Deskripsi: method ini berfungsi untuk mengembalikan id penjualan.
        return this.IDPenjualan;
    }

    public void setIDPenjualan(String IDPenjualan) {
        //Deskripsi: method ini berfungsi untuk memberikan id penjualan.
        this.IDPenjualan = IDPenjualan;
    }

    public String getTanggal() {
        //Deskripsi: method ini berfungsi untuk mengembalikan tanggal penjualan.
        return this.Tanggal;
    }

    public void setTanggal(String Tanggal) {
        //Deskripsi: method ini berfungsi untuk memberikan id penjualan.
        this.Tanggal = Tanggal;
    }

    public String getIDPetugas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan id petugas.
        return this.IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        //Deskripsi: method ini berfungsi untuk memberikan id petugas.
        this.IDPetugas = IDPetugas;
    }

    @Override
    public String toString() {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return
            
            "\t\t" + getTanggal() +
            "/" + getIDPenjualan() +
            "/" + getIDPetugas()
            ;
    }

}