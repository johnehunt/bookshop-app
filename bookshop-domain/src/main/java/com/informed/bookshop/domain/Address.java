package com.informed.bookshop.domain;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.StringJoiner;

/**
 * Represents a com.informed.bookshop.domain.Address of something or someone.
 */
@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
	private int number;
	private String street;
	private String city;
	private String county;
  @NotBlank
	private String postcode;

  public Address() {}

	public Address(int number, String street, String city, String county, String postcode) {
    this(0, number, street, city, county, postcode);
  }

  public Address(int id, int number, String street, String city, String county, String postcode) {
    this.id = id;
    this.number = number;
		this.street = street;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
	}

  public int getNumber() {
    return number;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getCounty() {
    return county;
  }

  public String getPostcode() {
    return postcode;
  }

  public int getId() {
    return id;
  }

  public String toString() {
		return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
				.add("number=" + number)
				.add("street='" + street + "'")
				.add("city='" + city + "'")
				.add("county='" + county + "'")
				.add("postcode='" + postcode + "'")
				.toString();
	}
}
