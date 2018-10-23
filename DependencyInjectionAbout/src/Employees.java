public class Employees {


    //Employees classı için değişkenler declare edildi
    private int id;
    private String fname;
    private String lname;
    private String email;
    private int tel;

    /*
      Address türünde, address adında değişken declare edildi
      Anlamı ise Employees classı Address classına bağımlı hale geldi
      Yani Employees classından oluşturacağımız bir nesne address classından oluşturacağımız bir nesneye bağımlı hale geldi
    */

    private Address address;



    //Get ve Set metodları oluşturuldu (alt + ins) ***********************
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //**************************************************


    //Tanımlanan değişken özelliklerini içine alan Constructor(yapılandırıcı) oluşturuldu
    public Employees(int id, String fname, String lname, String email, int tel, Address address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }


    //toString() metodu oluşturuldu
    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", address=" + address +
                '}';
    }


    //Setter metodunu kullanabilmek için boş fonksiyon oluşturuldu
    public Employees() {
    }

}
