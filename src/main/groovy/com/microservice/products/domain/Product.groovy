package com.microservice.products.domain

import javax.persistence.*

@Entity
@Table(name = "product")
class Product {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  Long id

  @Column(name = "product_name")
  String name
  @Column(name = "price")
  Double price
  @Column(name = "date_created")
  Date dateCreated

}