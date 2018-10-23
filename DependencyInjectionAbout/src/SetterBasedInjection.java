public class SetterBasedInjection {

    public static void main(String [] args) {


        //Address nesnesi oluşturuldu
        Address adres = new Address("Levent Mahallesi, Aydın Sokak Bellevue Residences","İstanbul","TR","34340");

        //Employees nesnesi oluşturuldu(NOT: Enjeksiyon işlemini set metodu ile yapabilmemiz için parametre almayan bir Construction (yapılandırıcı) oluşturulması gerekmektedir)
        Employees employees = new Employees();

        //set ile değer atama işlemlerini gerçekleştirildi
        employees.setId(1);
        employees.setFname("Bill");
        employees.setLname("Gates");
        employees.setEmail("billgates@microsoft.com");
        employees.setTel(4440444);

        //Employees classından oluşturuduğumuz employees nesnesinin ihtiyac duyduğu address bağımlığı set metoduyla gerçekleştirildi
        employees.setAddress(adres);

    }

}
