public class Login {
    String KodeLogin;
    String UName;
    String Pass;


    public Login() {
    }

    public Login(String KodeLogin, String UName, String Pass) {
        this.KodeLogin = KodeLogin;
        this.UName = UName;
        this.Pass = Pass;
    }

    public String getKodeLogin() {
        //Deskripsi: method ini berfungsi untuk mengembalikan kode login.
        return this.KodeLogin;
    }

    public void setKodeLogin(String KodeLogin) {
        //Deskripsi: method ini berfungsi untuk memberikan kode login.
        this.KodeLogin = KodeLogin;
    }

    public String getUName() {
        //Deskripsi: method ini berfungsi untuk mengembalikan username.
        return this.UName;
    }

    public void setUName(String UName) {
        //Deskripsi: method ini berfungsi untuk memberikan username.
        this.UName = UName;
    }

    public String getPass() {
        //Deskripsi: method ini berfungsi untuk mengembalikan password.
        return this.Pass;
    }

    public void setPass(String Pass) {
        //Deskripsi: method ini berfungsi untuk memberikan password.
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        return "{" +
            " KodeLogin='" + getKodeLogin() + "'" +
            ", UName='" + getUName() + "'" +
            ", Pass='" + getPass() + "'" +
            "}";
    }

    /*public void LupaPass(){
        for (UName uname1 : Uname) {
            
        }
    }
*/
}