package com.informed.bookshop.dao;

import com.informed.bookshop.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("JDBCAddressDAO")
public class JDBCAddressDAO implements AddressDAO {

  private JdbcTemplate jdbcTemplate;

  @Autowired
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Address> getAllAddresses() {
    String sql = "SELECT * FROM address";
    RowMapper<Address> rowMapper = new AddressRowMapper();
    return this.jdbcTemplate.query(sql, rowMapper);
  }

  public void addAddress(Address address) {
    String sql = "INSERT INTO address " +
      "(number,street,city,county,postcode) " +
      "VALUES (?,?,?,?,?)";
    jdbcTemplate.update(sql,
      address.getNumber(),
      address.getStreet(),
      address.getCity(),
      address.getCounty(),
      address.getPostcode());
  }
}

class AddressRowMapper implements RowMapper<Address> {
  public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
    int id = rs.getInt("id");
    int number = rs.getInt("number");
    String street = rs.getString("street");
    String city = rs.getString("city");
    String county = rs.getString("county");
    String postcode = rs.getString("postcode");
    return new Address(id, number, street, city, county, postcode);
  }
}
