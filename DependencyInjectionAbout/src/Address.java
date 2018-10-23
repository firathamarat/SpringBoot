public class Address {

    //Değişkenler declare edildi
    private String streetAddress;
    private String city;
    private String state;
    private String zip;


    //Get ve Set metodları oluşturuldu (alt + ins) ***********************
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    //*************************************************************


    //Tanımlanan değişken özelliklerini içine alan Constructor(yapılandırıcı) metod oluşturuldu
    public Address(String streetAddress, String city, String state, String zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    //En son olarak toString() metodu oluşturuldu
    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }



}
