package com.informed.bookshop.service;

import com.informed.bookshop.dao.AddressDAO;
import com.informed.bookshop.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AddressService {

  private AddressDAO dao;

  @Autowired
  public void setDao(@Qualifier("repoAddressDAO") AddressDAO dao) {
    this.dao = dao;
  }

  public List<Address> getAllAddresses() {
    return dao.getAllAddresses();
  }

  public void addAddress(Address address) {
    dao.addAddress(address);
  }
}
