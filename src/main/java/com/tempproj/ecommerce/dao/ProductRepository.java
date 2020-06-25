package com.tempproj.ecommerce.dao;

import com.tempproj.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Product - is for Entity, Long - is for Primary Key
 */
public interface ProductRepository extends JpaRepository<Product,Long>{
}
