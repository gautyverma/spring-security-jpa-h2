package com.matuga.springsecurityjpah2basicAuth.repository;

import com.matuga.springsecurityjpah2basicAuth.model.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByEmail(String email);
}
