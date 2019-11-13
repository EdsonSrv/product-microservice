package com.microservice.products.domain

import javax.persistence.*

@Entity
class Product {

  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Id
  Long id

  @Column(name = "name")
  String name
  @Column(name = "price")
  Double price
  @Column(name = "date_created")
  Date dateCreated

}