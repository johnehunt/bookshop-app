package com.informed.bookshop.dao;

import com.informed.bookshop.domain.Address;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component("jpaAddressDAO")
public class JPAAddressDAO implements AddressDAO {

  private EntityManager entityManager;

  @PersistenceContext
  public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  public List<Address> getAllAddresses() {
    TypedQuery<Address> query =
      entityManager.createQuery("SELECT a FROM Address a", Address.class);
    return query.getResultList();
  }

  @Transactional
  public void addAddress(Address address) {
    entityManager.persist(address);
  }
}
