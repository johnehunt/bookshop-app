package com.informed.bookshop.exception;

public class MissingBookException extends RuntimeException {
  public MissingBookException() {
  }

  public MissingBookException(String message) {
    super(message);
  }

  public MissingBookException(Throwable cause) {
    super(cause);
  }

  public MissingBookException(String message, Throwable cause) {
    super(message, cause);
  }
}
