package io.firathamarat.restservice.model;

/*   new > Java Class yapılarak metin içine nokta koyarsanız klaör olarak algılamaktadır

*/

import com.fasterxml.jackson.annotation.JsonInclude;

//Bir person objesin herhangibi bir alanı null ise servisle gönderilmesin anlamındadır
@JsonInclude(value = JsonInclude.Include.NON_NULL)

public class Person {

    private int id;
    private String name;
    private String surname;
    private String username;


    //Generate menüsüne ulaşmak için: Code > Generate veya Alt + Insert tuşları kullanılır
    //Aşağıdaki getter ve setter fonksiyonları Generate penceresi kullanılarak oluşturulmuştur.(Hepsi işaretlendi)


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
