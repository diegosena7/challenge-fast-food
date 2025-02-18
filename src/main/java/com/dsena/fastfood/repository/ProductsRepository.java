package com.dsena.fastfood.repository;

import com.dsena.fastfood.model.ProductsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<ProductsEntity, String> {
}
