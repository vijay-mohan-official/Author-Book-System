package com.ults.author.dataloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ults.author.entity.Author;
import com.ults.author.entity.Book;
import com.ults.author.repository.AuthorRepository;
import com.ults.author.repository.BookRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	@Autowired
	public DataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		// Insert author with 3 books
		Author author1 = new Author();
		author1.setName("Author1");
		authorRepository.save(author1);

		for (int i = 1; i <= 4; i++) {
			Book book = new Book();
			book.setTitle("Book" + i);
			book.setAuthor(author1);
			bookRepository.save(book);
		}

		// Insert author with 4 books
		Author author2 = new Author();
		author2.setName("Author2");
		authorRepository.save(author2);

		for (int i = 5; i <= 9; i++) {
			Book book = new Book();
			book.setTitle("Book" + i);
			book.setAuthor(author2);
			bookRepository.save(book);
		}
	}
}