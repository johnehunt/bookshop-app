package com.informed.bookshop.controller;

import com.informed.bookshop.domain.Book;
import com.informed.bookshop.exception.IllegalProductPriceException;
import com.informed.bookshop.exception.MissingBookException;
import com.informed.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("bookshop")
public class BookController {

  private BookService bookService;

  @Autowired
  public void setBookService(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/books")
  @ResponseStatus(HttpStatus.OK)
  public List<Book> getBooks() {
    System.out.println("BookController.getBooks()");
    return bookService.getBooks();
  }

  @GetMapping("/books/{title}")
  @ResponseStatus(HttpStatus.OK)
  public Book getBookByTitle(@PathVariable String title) {
    Book book = bookService.getBookByTitle(title);
    return book;
  }

  @PostMapping("/books")
  @ResponseStatus(HttpStatus.CREATED)
  public void addBook(@RequestBody Book book, HttpServletResponse response) {
    System.out.println("BookController.addBook(" + book.getTitle() + ")");
    if (book != null) {
      bookService.addBook(book);
    } else {
      response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
    }
  }

  @ExceptionHandler(MissingBookException.class)
  @ResponseStatus(
    value = HttpStatus.NOT_FOUND,
    reason = "Invalid Request")
  public void bookRequestFailure() {
    System.out.println("Handling error");
  }

//  @ExceptionHandler(IllegalProductPriceException.class)
//  @ResponseStatus(
//    value = HttpStatus.I_AM_A_TEAPOT,
//    reason = "Invalid Price")
//  public void bookFormatPriceFailure() { }

}
