package com.informed.bookshop.dao;

import com.informed.bookshop.domain.Address;
import com.informed.bookshop.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component("repoAddressDAO")
public class RepoAddressDAO implements AddressDAO {

  @Autowired
  private AddressRepo addressRepo;

  public List<Address> getAllAddresses() {
    Iterable<Address> searchResults = this.addressRepo.findAll();
    List<Address> addresses = new ArrayList<>();
    searchResults.forEach(addresses::add);
    return addresses;
  }

  @Transactional
  public void addAddress(Address address) {
    this.addressRepo.save(address);
  }
}
