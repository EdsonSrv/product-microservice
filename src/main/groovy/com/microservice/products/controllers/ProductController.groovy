package com.microservice.products.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.microservice.products.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import com.microservice.products.domain.Product

@RestController
class ProductController {

  @Autowired
  ProductService productService

  @GetMapping("/list")
  List<Product> list(){
    productService.findAll()
  }

  @GetMapping("/detail/{id}")
  Product detail(@PathVariable Long id){
    productService.findById(id)
  }

}