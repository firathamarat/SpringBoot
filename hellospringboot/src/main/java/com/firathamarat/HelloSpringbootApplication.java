package com.firathamarat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


		/**
		 Proje oluşturuldu
		 src > main > java > com.firathamarat.springboot > SpringbootApplication dosyası düzenleniyor

		 Spring Boot projeleri SpringBootServletInitializer yardımı ile çalışmaktadır.
		 SpringApplication.run() bloğu ile projenin çalışması sağlanmaktadır.

		 MerhabaController adında class oluşturularak düzenleme yapılır.
		 MerhabaController sınıfı düzenlendikten sonra ekranda gösterilmek üzere
		 src > main > resource > template alanında .html dosyası oluşturulur.

		 */


@SpringBootApplication
public class HelloSpringbootApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloSpringbootApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

}