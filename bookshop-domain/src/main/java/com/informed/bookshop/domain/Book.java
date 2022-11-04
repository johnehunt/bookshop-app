package com.informed.bookshop.domain;

/**
 * Represents a com.informed.bookshop.domain.Book with a title, author, publisher and a price.
 */
public class Book extends Product {

  //----------------------------
  // Static side of class

  private static int instanceCount;

  private static void incremanetInstanceCount() {
    instanceCount++;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  //--------------------------------

	private Author author;
	private Publisher publisher;


  public Book() {}

	public Book(String title, Author author, Publisher publisher, double price) {
		super(title, price);
    incremanetInstanceCount();
		this.author = author;
		this.publisher = publisher;

	}

  public Author getAuthor() {
    return author;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public double calculateSalePrice(double discount) {
    return this.getPrice() - (this.getPrice() * discount);
  }

  @Override
  public String toString() {
    return "Book{" +
      super.toString() +
      "author=" + author +
      ", publisher=" + publisher +
      '}';
  }
}
