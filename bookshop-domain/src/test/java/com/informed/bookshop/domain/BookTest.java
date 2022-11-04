package com.informed.bookshop.domain;

import com.informed.bookshop.test.util.BookFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

  private Book book;

  @BeforeEach
  void setUp() {
    book = BookFactory.createBook();
  }

  @Test
  void testSetupOfBook() {
    assertEquals(book.getTitle(), "Java Unleashed");
  }

  @Test
  void testCalculateSalePrice() {
    double result = book.calculateSalePrice(0.2);
    assertEquals(12.76, result, 0.01);
  }

}
