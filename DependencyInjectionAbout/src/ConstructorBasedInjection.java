public class ConstructorBasedInjection {

    public static void main(String [] args){

        /* Bir Employess nesnesi oluşturuyoruz
           Employess classında yer alan Constructor metodundaki argumanlarını yazıyoruz, address değişkeninin Address class tipinde olması gerekmektedir
           Değerleri girdikten sonra ilgili class çalıştırılarak sonuç görülmektedir
        */

        System.out.println(
                new Employees(1,"Bill","Gates","billgates@microsoft.com",4440444,
                        new Address("Levent Mahallesi, Aydın Sokak Bellevue Residences","İstanbul","TR","34340")));

    }

    //Employess classının ihtiyacı olan Address class tipindeki address bağımlılığı Constructor(yapılandırıcı) ile Employess sınıfı ile oluşturulan nesneye enjekte edildi

    /* Ekran Çıktısı:

     Employees{
         id=1,
         fname='Bill',
         lname='Gates',
         email='billgates@microsoft.com',
         tel=4440444,
         address = Address {
             streetAddress='Levent Mahallesi, Aydın Sokak Bellevue Residences',
             city='İstanbul',
             state='TR',
             zip='34340'
        }
     }

     */

}
