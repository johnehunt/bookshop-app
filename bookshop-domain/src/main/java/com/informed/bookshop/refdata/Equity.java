package com.informed.bookshop.refdata;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "equities")
public class Equity extends ReferenceData {

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  private String countryOfOrigin;

  public Equity(){}

  public Equity(String name, String symbol) {
    super(name, symbol);
  }

  public Equity(int id, String name, String symbol) {
    super(id, name, symbol);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Equity )) return false;
    Equity equity = (Equity) o;
    return id == equity.id && name.equals(equity.name) && symbol.equals(equity.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, symbol);
  }

  @Override
  public String toString() {
    String sb = "Equity{" + "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", symbol='" + symbol + '\'' +
      '}';
    return sb;
  }
}

