package com.informed.bookshop.refdata;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="currencies")
public class Currency extends ReferenceData {
  public Currency() {}

  public Currency(String name, String symbol) {
    super(name, symbol);
  }

  public Currency(int id, String name, String symbol) {
    super(id, name, symbol);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Currency)) return false;
    Currency currency = (Currency)o;
    return id == currency.id && name.equals(currency.name) && symbol.equals(currency.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, symbol);
  }

  @Override
  public String toString() {
    String sb = "Currency{" + "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", symbol='" + symbol + '\'' +
      '}';
    return sb;
  }
}
