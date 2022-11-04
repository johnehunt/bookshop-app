package com.informed.bookshop.service;

import com.informed.bookshop.domain.Address;
import com.informed.bookshop.domain.Author;
import com.informed.bookshop.domain.Book;
import com.informed.bookshop.domain.Publisher;
import com.informed.bookshop.exception.MissingBookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

  private final List<Book> books = new ArrayList<>();

  public BookService() {
    setup();
  }

  public List<Book> getBooks() {
    return books;
  }

  public boolean containsBook(Book book) {
    return books.contains(book);
  }

  public boolean addBook(Book book) {
    return books.add(book);
  }

  public boolean removeBook(Book book) {
    return books.remove(book);
  }

  private void setup() {
    Address authorAddress = new Address(10, "High Street",
      "Any Town", "Somerset",
      "SA1 23Z");
    Author author = new Author("Pete Smith", authorAddress);

    Address publisherAddress = new Address(1, "Main Street",
      "Some City", "Kent",
      "KA1 43A");
    Publisher publisher =
      new Publisher("Tech Books Publishing Ltd.",
        publisherAddress);

    Book book1 = new Book("Java Unleashed",
      author, publisher, 15.95);
    Book book2 = new Book("Kotlin Unleashed",
      author, publisher, 10.95);
    Book book3 = new Book("Typescript Unleashed",
      author, publisher, 5.95);

    this.books.add(book1);
    this.books.add(book2);
    this.books.add(book3);

  }

  public Book getBookByTitle(String title) {
    return
      books.stream()
        .filter(b -> b.getTitle().equalsIgnoreCase(title))
        .findFirst()
        .orElseThrow(MissingBookException::new); // () -> new MissingBookException()
  }

}
