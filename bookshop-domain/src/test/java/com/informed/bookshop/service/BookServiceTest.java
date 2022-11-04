package com.informed.bookshop.service;

import com.informed.bookshop.domain.Book;
import com.informed.bookshop.test.util.BookFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = { ServiceTestConfig.class})
class BookServiceTest {

  @Autowired
  private BookService service;

  @Test
  @DisplayName("test getting the books from the service")
  void testGetAllBooks() {
    List<Book> result = service.getBooks();
    assertEquals(3, result.size(), "There should be 3 books in the bookstore");
  }

  @Test
  void testAddBookToService() {
    Book book = BookFactory.createBook();
    service.addBook(book);
    assertThat(service.getBooks())
      .contains(book);
    service.removeBook(book);
  }

  @Test
  void testGetBookByTitle() {
    Book book = service.getBookByTitle("Java Unleashed");
    assertThat(book)
      .isNotNull()
      .extracting("title", "price")
      .doesNotContainNull()
      .containsExactly("Java Unleashed", 15.95);
  }
}
