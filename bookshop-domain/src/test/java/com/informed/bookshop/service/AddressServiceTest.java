package com.informed.bookshop.service;

import com.informed.bookshop.domain.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = { ServiceTestConfig.class})
class AddressServiceTest {

  @Autowired
  private AddressService service;

  @Test
  void getAllAddresses() {
    List<Address> addresses = service.getAllAddresses();
    assertThat(addresses.isEmpty()).isTrue();
  }

  @Test
  void addAnAddress() {
    Address address = new Address(10, "High Street", "Anytown", "BANES", "BA1 2EE");
    service.addAddress(address);
    List<Address> addresses = service.getAllAddresses();
    assertThat(addresses)
      .filteredOn(a -> a.getStreet().contains("High Street")
        && a.getNumber() == 10)
      .hasSize(1);
  }
}
