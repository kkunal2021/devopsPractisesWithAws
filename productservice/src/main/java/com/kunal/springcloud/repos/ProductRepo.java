package com.kunal.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kunal.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
