public class Petugas{
    String IDPetugas;
    String NamaPetugas;
    String Email;
    String AlamatPetugas;
    String UName;
    String Pass;
    

    public Petugas() {
    }

    public Petugas(String IDPetugas, String NamaPetugas, String Email, String AlamatPetugas, String UName, String Pass) {
        this.IDPetugas = IDPetugas;
        this.NamaPetugas = NamaPetugas;
        this.Email = Email;
        this.AlamatPetugas = AlamatPetugas;
        this.UName = UName;
        this.Pass = Pass;
    }

    public String getIDPetugas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan id petugas.
        return this.IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        //Deskripsi: method ini berfungsi untuk memberikan id petugas.
        this.IDPetugas = IDPetugas;
    }

    public String getNamaPetugas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nama petugas.
        return this.NamaPetugas;
    }

    public void setNamaPetugas(String NamaPetugas) {
        //Deskripsi: method ini berfungsi untuk memberikan nama petugas.
        this.NamaPetugas = NamaPetugas;
    }

    public String getEmail() {
        //Deskripsi: method ini berfungsi untuk mengembalikan email petugas.
        return this.Email;
    }

    public void setEmail(String Email) {
        //Deskripsi: method ini berfungsi untuk memberikan email petugas.
        this.Email = Email;
    }

    public String getAlamatPetugas() {
        //Deskripsi: method ini berfungsi untuk mengembalikan alamat petugas.
        return this.AlamatPetugas;
    }

    public void setAlamatPetugas(String AlamatPetugas) {
        //Deskripsi: method ini berfungsi untuk memberikan alamat petugas.
        this.AlamatPetugas = AlamatPetugas;
    }

    public String getUName() {
        //Deskripsi: method ini berfungsi untuk mengembalikan username petugas.
        return this.UName;
    }

    public void setUName(String UName) {
        //Deskripsi: method ini berfungsi untuk memberikan username petugas.
        this.UName = UName;
    }

    public String getPass() {
        //Deskripsi: method ini berfungsi untuk mengembalikan password petugas.
        return this.Pass;
    }

    public void setPass(String Pass) {
        //Deskripsi: method ini berfungsi untuk memberikan password petugas.
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return "{" +
            " IDPetugas='" + getIDPetugas() + "'" +
            ", NamaPetugas='" + getNamaPetugas() + "'" +
            ", Email='" + getEmail() + "'" +
            ", AlamatPetugas='" + getAlamatPetugas() + "'" +
            ", UName='" + getUName() + "'" +
            ", Pass='" + getPass() + "'" +
            "}";
    }

} 