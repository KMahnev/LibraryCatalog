package com.sberbank.librarycatalog;

import com.sberbank.librarycatalog.entity.Book;
import com.sberbank.librarycatalog.repository.LibraryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class LibrarycatalogApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext context=SpringApplication.run(LibrarycatalogApplication.class);
        LibraryRepository repository=context.getBean(LibraryRepository.class);

        repository.save(new Book("Lord of the rings","J.R.R.Tolkien","UKBook",true,"","11/2"));
		repository.save(new Book("Преступление и наказание","Ф.М.Достоевский","АСТ",false,"Иванов И.И.",""));
		repository.save(new Book("Преступление и наказание","Ф.М.Достоевский","АСТ",true,"","8/1"));
		repository.save(new Book("Преступление и наказание","Ф.М.Достоевский","АСТ",true,"","8/1"));
		repository.save(new Book("Введение в машинное обучение с помощью python","А.Мюллер","O'reillY",true,"","15/7"));
		repository.save(new Book("Scala.Проффесиональное программирование","М.Одерски","Питер",true,"","15/7"));
		repository.save(new Book("Scala.Проффесиональное программирование","М.Одерски","Питер",false,"Петров С.М",""));
		repository.save(new Book("По ту сторону добра и зла","Ф.Ницше","Азбука",true,"","13/6"));
		repository.save(new Book("Так говорил Заратустра","Ф.Ницше","Азбука",true,"","13/6"));
		repository.save(new Book("Бегство от свободы","Э.Фромм","АСТ",true,"","13/7"));
		repository.save(new Book("Бегство от свободы","Э.Фромм","АСТ",false,"Михайлов В.В.",""));
		repository.save(new Book("Бегство от свободы","Э.Фромм","Азбука",true,"","13/7"));
	}
}
