package com.informed.bookshop.main;

import com.informed.bookshop.domain.Book;
import com.informed.bookshop.service.BookService;

import java.util.List;

public class Bookshop {
  private BookService bookService = new BookService();

  public Bookshop() {}

  public List<Book> getBooks() {
    return bookService.getBooks();
  }

}
