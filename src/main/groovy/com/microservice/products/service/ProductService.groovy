package com.microservice.products.service

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import com.microservice.products.repo.ProductRepository
import com.microservice.products.domain.Product

@Service
class ProductService {

  @Autowired
  ProductRepository productRepository

  @Transactional(readOnly = true)
  List<Product> findAll(){
    productRepository.findAll()
  }

  @Transactional(readOnly = true)
  Product findById(Long id){
    productRepository.findById(id).orElse(null)
  }

}