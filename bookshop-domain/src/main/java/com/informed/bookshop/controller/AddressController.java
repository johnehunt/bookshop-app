package com.informed.bookshop.controller;

import com.informed.bookshop.domain.Address;
import com.informed.bookshop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller used for all address urls.
 */
@RestController
@RequestMapping("bookshop")
public class AddressController {

  private AddressService addressService;

  @Autowired
  public void setAddressService(AddressService addressService) {
    this.addressService = addressService;
  }

  @GetMapping("/addresses")
  @ResponseStatus(HttpStatus.OK)
  public List<Address> getAddresses() {
    System.out.println("AddressController.getAddresses()");
    return addressService.getAllAddresses();
  }

  @PostMapping("/addresses")
  @ResponseStatus(HttpStatus.CREATED)
  public void addAddress(@RequestBody Address address) {
    System.out.println("AddressController.addAddress(" + address + ")");
    addressService.addAddress(address);
  }

}
