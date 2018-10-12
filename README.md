
<p align="center">
 <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/logo1.png" width="450"><br>
 <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/logo2.png" width="250">
</p>

### Spring Boot Nedir ?
Spring Framework kullanarak uygulama geliştirirken .xml dosyaları üzerinden konfigürasyon işlemlerini yapılmaktadır. 
Bu işlemler proje büyüdükçe vakit alabiliyor. Spring Boot ise bu vakit kaybını en aza indirmeyi planlayan bir başka Spring Freamework’üdür. **Spring Boot sadece koda odaklanmayı sağlamayı amaçlamakta olup bizi xml dosyaları üzerindeki vakit kaybını ortadan kaldırır.** Xml dosyaları ile uğraşmadan Spring tabanlı uygulamaları hemen geliştirebileceğimiz Spring Boot ile yapabilecekleriniz sınırsızdır.

### Spring Boot Projesi Oluşturmak:

- **start.spring.io** 

<a href="https://start.spring.io/" target="_blank">start.spring.io</a> adresine girerek nasıl bir proje oluşturacak isek seçenekleri seçerek, Spring Boot haricinde başka bir bağımlığa ihtiyacımız varsa `Search for dependencies` kısmından arayıp projenize ekleyebilirsiniz. Projeye bağlı seçenekler seçildikten sonra `Generate Project` butonuna tıklayarak **.zip** uzantılı dosyayı bilgisayarınıza indirip IDE’nizde açabilirsiniz.
<br><br>

- **Intellij IDEA** 

 Intellij açıldıktan sonra yeni bir proje oluşturma ekranından projeyi oluşturmaya başlıyoruz. Açılan pencerede sol kısımda bulunan alandan `Spring Initializr` seçeneğini seçip next tuşu ile ilerliyoruz

<p align="center">
  <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/step1.jpg" width="350">
  <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/step2.jpg" width="350">
</p>

<p align="center">
Sonraki ekranda ise projenin detayları belirlenmektedir. (Paket yapısını, sürümünü versiyonlama işlemlerini) Sonrasında Spring Boot projesine hangi bağımlılıkların ekleyeceği bu ekranda seçilmektedir. Eğer bu ekranda bir şey seçilmezse proje oluşturulduğunda pom.xml dosyasına maven adreslerini ekleyerek de kullanılabilmektedir.
</p>

<p align="center">
  <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/step3.jpg" width="350">
  <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/step4.jpg" width="350">
  <img src="https://github.com/firathamarat/SpringBoot/blob/master/setup/step5.jpg" width="350">
</p>

<br><br>
### Custom Banner Oluşturma:

Spring Boot çalıştırıldığında console ekranına ilk gelen ASCII karakterleri Spring Boot yazısıdır. Değiştirebilmek için; <br>

`src` > `main` > `resources` > (right click) > `new` > `file` > (name: banner.txt) yolu izlenerek dosya yaratıldıktan sonra <a href="https://devops.datenkollektiv.de/banner.txt/index.html" target="_blank">devops.datenkollektiv.de</a> adresinden hoşunuza giden ASCII şeklini kopyalayarak oluşturduğumuz banner.txt dosyasına açıp projeyi çalıştırmak. Yazınız console ekranında görünecektir.


### Tomcat Port Değiştirme:

Spring Boot ile gelen Tomcat portunu kolaylıkla değiştirebilirsiniz. Oluşturmuş olduğunuz projenin `application.properties` dosyasına
`server.port = 8786` yazark veya java bean olarak  

```java
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;
 
@Component
public class CustomPort implements EmbeddedServletContainerCustomizer {
 
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
 
		container.setPort(8786);
 
	}
 
}
```
`container.setPort( 8786 );` kodunu projemize ekleyerek kolay bir şekilde Tomcat portunu değiştirebilirsiniz.










[I'm an inline-style link](https://www.google.com)
`<link>` : <https://github.com>

**KAlın yazmak içi**

> ef
- Markdown:


```sh
$ npm install --production
$ NODE_ENV=production node app
```

```sh
cd dillinger
docker build -t joemccann/dillinger:${package.json.version} .
```

`<link>` : <https://github.com>



`${package.json.version}` with the actual version of Dillinger.
