package com.informed.bookshop.domain;

public class SampleProduct extends Product {
  public SampleProduct(String title, double price) {
    super(title, price);
  }
  public double calculateSalePrice(double discount) {
    return 0.0;
  }
}
