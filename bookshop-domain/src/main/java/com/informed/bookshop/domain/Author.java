package com.informed.bookshop.domain;

/**
 * Represents an author or creator of something.
 */
public class Author extends Person {

  private String genre;

  public Author() {}

  public Author(String name, Address address) {
    this(name, address, "");
  }

  public Author(String name, Address address, String genre) {
    super(name, address);
    this.genre = genre;
	}

  @Override
  public String toString() {
    return "Author{" +
      super.toString() +
      "genre='" + genre + '\'' +
      '}';
  }
}
