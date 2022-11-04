package com.informed.bookshop.domain;

import javax.persistence.*;


@Entity
@Table(name="clients")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  @ManyToOne
  @JoinColumn(name = "address_id")
  private Address address;

  public Client() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Client(int id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


}
