public class Barang {
    String Barcode;
    String Jenis;
    String NamaItem;
    int Kuantitas;
    int Stok;
    int Harga; 


    public Barang() {
    }

    public Barang( int Stok) {
        this.Stok = Stok; 
    }

    public Barang(String Barcode, String Jenis, String NamaItem, int Kuantitas, int Harga) {
        this.Barcode = Barcode;
        this.Jenis = Jenis;
        this.NamaItem = NamaItem;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
    }

    public String getBarcode() {
        //Deskripsi: method ini berfungsi untuk mengembailkan barcode barang.
        return this.Barcode;
    }

    public void setBarcode(String Barcode) {
        //Deskripsi: method ini berfungsi untuk memberikan barcode barang.
        this.Barcode = Barcode;
    }

    public String getJenis() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kategori barang.
        return this.Jenis;
    }

    public void setJenis(String Jenis) {
        //Deskripsi: method ini berfungsi untuk memberikan kategori barang.
        this.Jenis = Jenis;
    }

    public String getNamaItem() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nama barang.
        return this.NamaItem;
    }

    public void setNamaItem(String NamaItem) {
        //Deskripsi: method ini berfungsi untuk memberikan nama barang.
        this.NamaItem = NamaItem;
    }

    public int getKuantitas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kuantitas barang.
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        //Deskripsi: method ini berfungsi untuk memberikan kuantitas barang.
        this.Kuantitas = Kuantitas;
    }

    public int getStok() {
        //Deskripsi: method ini berfungsi untuk mengembalikan stok barang.
        return this.Stok;
    }

    public void setStok(int Stok) {
        //Deskripsi: method ini berfungsi untuk memberikan stok barang.
        this.Stok = Stok;
    }

    public int getHarga() {
        //Deskripsi: method ini berfungsi untuk mengembalikan harga barang.
        return this.Harga;
    }

    public void setHarga(int Harga) {
        //Deskripsi: method ini berfungsi untuk menaruh harga barang.
        this.Harga = Harga;
    }

    
    @Override
    public String toString() 
    {
        return "\n" + 
            "BARCODE\t\t:" + getBarcode() +
            "\nJENIS\t\t:" + getJenis()  +
            "\nNAMA ITEM\t:" + getNamaItem() +
            "\nKUANTITAS \t:" + getKuantitas() + 
            "\nHARGA\t\t:" + getHarga() +
            "\nSTOK\t\t:" + getStok();
    }
}