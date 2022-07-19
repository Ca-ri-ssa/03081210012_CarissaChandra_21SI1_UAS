public class Transaksi {
    String Namabrg;
    int Kuantitas;
    String tgl;
    int Harga;


    public String getNamabrg() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nama barang.
        return this.Namabrg;
    }

    public void setNamabrg(String Namabrg) {
        //Deskripsi: method ini berfungsi untuk memberikan nama barang.
        this.Namabrg = Namabrg;
    }

    public int getKuantitas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kuantitas barang.
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        //Deskripsi: method ini berfungsi untuk memberikan kuantitas barang.
        this.Kuantitas = Kuantitas;
    }

    public String getTgl() {
        //Deskripsi: method ini berfungsi untuk mengembalikan tanggal transaksi.
        return this.tgl;
    }

    public void setTgl(String tgl) {
        //Deskripsi: method ini berfungsi untuk memberikan tanggal transaksi.
        this.tgl = tgl;
    }

    public int getHarga() {
        //Deskripsi: method ini berfungsi untuk mengembalikan harga transaksi.
        return this.Harga;
    }

    public void setHarga(int Harga) {
        //Deskripsi: method ini berfungsi untuk memberikan tanggal transaksi.
        this.Harga = Harga;
    }


    public Transaksi(String Namabrg, int Kuantitas, String tgl, int Harga) {
        this.Namabrg = Namabrg;
        this.Kuantitas = Kuantitas;
        this.tgl = tgl;
        this.Harga = Harga;
    }


    @Override
    public String toString() {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return
            " Nama Barang\t= " + getNamabrg() + "\n" +
            " Kuantitas\t= " + getKuantitas() + "\n" +
            " Tanggal\t= " + getTgl() + "\n" +
            " Total Harga\t= " + getHarga() + "\n";
    }

}