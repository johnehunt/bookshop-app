package com.informed.bookshop.domain;

import com.informed.bookshop.exception.IllegalProductPriceException;

public abstract class Product implements Sales {

  private String title;
  private double price;

  public Product() {}

  public Product(String title, double price) {
    super();
    this.title = title;
    this.setPrice(price);
  }


  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0.0) {
      throw new IllegalProductPriceException("Invalid price for book " + title + " with " + price);
    } else {
      this.price = price;
    }
  }

  @Override
  public String toString() {
    return "{" +
      "title='" + title + '\'' +
      ", price=" + price +
      '}';
  }

  public abstract double calculateSalePrice(double discount);
}
