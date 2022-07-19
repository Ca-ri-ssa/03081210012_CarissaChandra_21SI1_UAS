public class Keranjang {
    String Barcode;
    String Jenis;
    String NamaItem;
    int Kuantitas;
    int Harga; 
    int Total;

    public Keranjang() {
    }


    public Keranjang(String Barcode, String Jenis, String NamaItem, int Kuantitas, int Harga, int Total) {
        this.Barcode = Barcode;
        this.Jenis = Jenis;
        this.NamaItem = NamaItem;
        this.Kuantitas = Kuantitas;
        this.Harga = Harga;
        this.Total = Total;
    }
    public int getTotal() {
        //Deskripsi: method ini berfungsi untuk mengembalikan total barang dalam keranjang.
        return this.Total;
    }

    public void setTotal(int Total) {
        //Deskripsi: method ini berfungsi untuk memberikan total barang dalam keranjang.
        this.Total = Total;
    }
    public String getBarcode() {
        //Deskripsi: method ini berfungsi untuk mengembalikan barcode barang dalam keranjang.
        return this.Barcode;
    }

    public void setBarcode(String Barcode) {
        //Deskripsi: method ini berfungsi untuk memberikan barcode barang dalam keranjang.
        this.Barcode = Barcode;
    }

    public String getJenis() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kategori barang dalam keranjang.
        return this.Jenis;
    }

    public void setJenis(String Jenis) {
        //Deskripsi: method ini berfungsi untuk memberikan kategori barang dalam keranjang.
        this.Jenis = Jenis;
    }

    public String getNamaItem() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nama barang dalam keranjang.
        return this.NamaItem;
    }

    public void setNamaItem(String NamaItem) {
        //Deskripsi: method ini berfungsi untuk memberikan kategori barang dalam keranjang.
        this.NamaItem = NamaItem;
    }

    public int getKuantitas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kuantitas barang dalam keranjang.
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        //Deskripsi: method ini berfungsi untuk memberikan kuantitas barang dalam keranjang.
        this.Kuantitas = Kuantitas;
    }

    public int getHarga() {
        //Deskripsi: method ini berfungsi untuk mengembalikan harga barang dalam keranjang.
        return this.Harga;
    }

    public void setHarga(int Harga) {
        //Deskripsi: method ini berfungsi untuk memberikan kuantitas barang dalam keranjang.
        this.Harga = Harga;
    }

    
    @Override
    public String toString() 
    {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return 
            getKuantitas() + "\t\t" +
            getNamaItem() + "\t\t\t" +  
            getHarga();
    }
   

}