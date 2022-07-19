public class Pelanggan {
    int NoHP2;

    public Pelanggan() {
    }

    public Pelanggan(int NoHP2) {
        this.NoHP2 = NoHP2;
    }

    public int getNoHP2() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nomor telepon pelanggan.
        return this.NoHP2;
    }

    public void setNoHP2(int NoHP2) {
        //Deskripsi: method ini berfungsi untuk memberikan nomor telepon pelanggan.
        this.NoHP2 = NoHP2;
    }

    @Override
    public String toString() {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return "{" +
            " NoHP2='" + getNoHP2() + "'" +
            "}";
    }
     
 
}