package com.informed.bookshop.test.util;

import com.informed.bookshop.domain.Address;
import com.informed.bookshop.domain.Author;
import com.informed.bookshop.domain.Book;
import com.informed.bookshop.domain.Publisher;

public class BookFactory {

  public static Book createBook() {
    Address authorAddress = new Address(10, "High Street",
      "Any Town", "Somerset",
      "SA1 23Z");
    Author author = new Author("Pete Smith", authorAddress);

    System.out.println("com.informed.bookshop.domain.Author: " + author);

    Address publisherAddress = new Address(1, "Main Street",
      "Some City", "Kent",
      "KA1 43A");
    Publisher publisher =
      new Publisher("Tech Books Publishing Ltd.",
        publisherAddress);

    Book book1 = new Book("Java Unleashed",
      author, publisher, 15.95);
    return book1;
  }
}
