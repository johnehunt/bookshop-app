package com.informed.bookshop.refdata;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class ReferenceData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected int id;
  protected String name;
  protected String symbol;

  public ReferenceData() {}

  public ReferenceData(String name, String symbol) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
  }

  public ReferenceData(int id, String name, String symbol) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSymbol() {
    return symbol;
  }


}
