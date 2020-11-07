package org.gonchar.chucknorrisjokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

//	@Bean
//	ChuckNorrisQuotes chuckNorrisQuotes() {
//		return new ChuckNorrisQuotes();
//	}

}
