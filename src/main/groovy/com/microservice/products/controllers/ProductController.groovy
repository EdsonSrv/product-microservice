package com.microservice.products.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.microservice.products.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import com.microservice.products.domain.Product

@RestController
class ProductController {

  @Autowired
  ProductService productService

  @GetMapping("/list")
  List<Product> list(){
    productService.findAll()
  }

}