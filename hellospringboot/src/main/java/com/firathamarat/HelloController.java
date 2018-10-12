package com.firathamarat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


    /**
     @RequestMapping anotasyonu ile HTTP isteklerini yönetilmektedir.
     Bu anotasyona bir value değeri vererek path tanımlaması yapabiliriz.
     Bu örnekte value değeri olarak “hello” değerini atadık.
     Bu atama işlemiyle birlikte aslında http://localhost:8080/hello adresine bir istek geldiği zaman ilgili controller’ın çalışmasını sağlandı.
     http://localhost:8080/hello adresine geldiğimizde çalışacak olan Controller’ın HelloFunction metodudur.
     Bu metodumuzun Modeline bir mesaj adında bir değer atıyoruz.
     Bu atadığımız değeri internet sayfasında görülecektir.
     */


@Controller
public class HelloController {

    @RequestMapping("/hello")

    public void merhaba(Model model) {
        String context = "Spring Boot Projesine Hoşgeldiniz";
        model.addAttribute("message", context);
    }

}
