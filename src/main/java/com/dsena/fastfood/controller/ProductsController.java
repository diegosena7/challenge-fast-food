package com.dsena.fastfood.controller;

import com.dsena.fastfood.model.ProductsEntity;
import com.dsena.fastfood.repository.ProductsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductsController {

    @Autowired
    ProductsRepository productsRepository;
    @PostMapping
    public String createProducts(@RequestBody @Valid ProductsEntity productsEntity){
        productsRepository.save(productsEntity);
        return "Products" + productsEntity.toString();
    }
}
