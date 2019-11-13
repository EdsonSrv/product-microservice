package com.microservice.products.service

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import com.microservice.products.repo.ProductRepository
import com.microservice.products.domain.Product

@Service
class ProductService {

  @Autowired
  ProductRepository productRepository

  List<Product> findAll(){
    productRepository.findAll()
  }

  Product findById(Long id){
    productRepository.findById(id)
  }

}