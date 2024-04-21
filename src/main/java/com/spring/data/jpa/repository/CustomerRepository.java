package com.spring.data.jpa.repository;

import com.spring.data.jpa.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//This repository is an interface that lets you perform various operations involving Person objects. It gets these operations by extending the PagingAndSortingRepository interface that is defined in Spring Data Commons.
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>, CrudRepository<Customer,Long>  {

    List<Customer> findByLastName(@Param("name") String name);

    Customer findById(long id);
}
