package com.informed.bookshop.main;

import com.informed.bookshop.domain.*;
import com.informed.bookshop.exception.IllegalProductPriceException;

import java.io.FileNotFoundException;

public class BookshopApp {

  public static void main(String[] args) {
    System.out.println("Welcome to the Java Bookshop");
    System.out.println("============================");

    try {
      Bookshop shop = new Bookshop();
//      for (Book book : shop.getBooks()) {
//        System.out.println(book);
//      }

      shop.getBooks().stream()
        .filter(b -> b.getPrice() < 12.0)
        .map(Book::getTitle)
        .forEach(System.out::println);

    } catch (ClassCastException exp) {
      System.out.println("Hi");
    } catch (ArrayIndexOutOfBoundsException exp) {
      exp.printStackTrace();
    } finally {
      System.out.println("Finally");
    }

    System.out.println("Number of books created = " + Book.getInstanceCount());
    System.out.println("Done");
  }


}
