package com.informed.bookshop.dao;

import com.informed.bookshop.domain.Address;

import java.util.List;

public interface AddressDAO {

  List<Address> getAllAddresses();
  void addAddress(Address address);

}
