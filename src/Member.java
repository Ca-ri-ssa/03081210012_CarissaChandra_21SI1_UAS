public class Member {
    int IDMember;
    String Nama;
    String Alamat;
    String NoHP;

    public Member() {
    }

    public Member(int IDMember, String Nama, String Alamat, String NoHP) {
        this.IDMember = IDMember;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoHP = NoHP;
    }

    public int getIDMember() {
        //Deskripsi: method ini berfungsi untuk mengembalikan id member.
        return this.IDMember;
    }

    public void setIDMember(int IDMember) {
        //Deskripsi: method ini berfungsi untuk memberikan id member.
        this.IDMember = IDMember;
    }

    public String getNama() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nama member.
        return this.Nama;
    }

    public void setNama(String Nama) {
        //Deskripsi: method ini berfungsi untuk memberikan nama member.
        this.Nama = Nama;
    }

    public String getAlamat() {
        //Deskripsi: method ini berfungsi untuk mengembalikan alamat member.
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        //Deskripsi: method ini berfungsi untuk memberikan alamat member.
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        //Deskripsi: method ini berfungsi untuk mengembalikan nomor telepon member.
        return this.NoHP;
    }

    public void setNoHP(String NoHP) {
        //Deskripsi: method ini berfungsi untuk memberikan nomor telepon member.
        this.NoHP = NoHP;
    }

    @Override
    public String toString() {
        //Deskripsi: method ini berfungsi untuk merubah nilai type data menjadi type data string
        return "{" +
            " IDMember='" + getIDMember() + "'" +
            ", Nama='" + getNama() + "'" +
            ", Alamat='" + getAlamat() + "'" +
            ", NoHP='" + getNoHP() + "'" +
            "}";
    }

} 