package com.informed.bookshop.exception;

public class IllegalProductPriceException extends IllegalArgumentException {
  public IllegalProductPriceException() {
  }

  public IllegalProductPriceException(String s) {
    super(s);
  }

  public IllegalProductPriceException(String message, Throwable cause) {
    super(message, cause);
  }

  public IllegalProductPriceException(Throwable cause) {
    super(cause);
  }
}
