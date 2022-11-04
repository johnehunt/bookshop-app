package com.informed.bookshop.domain;

public abstract class Person {

  private String name;
  private Address address;

  public Person() {}

  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "{" +
      "name='" + name + '\'' +
      ", address=" + address +
      '}';
  }
}
