package com.informed.bookshop.domain;

public interface Sales {

  /**
   * Calculates the sales price for somethingbeing sold.
   * @param discount the discount percentage
   * @return the sale price
   */
  double calculateSalePrice(double discount);

  String getTitle();

}
