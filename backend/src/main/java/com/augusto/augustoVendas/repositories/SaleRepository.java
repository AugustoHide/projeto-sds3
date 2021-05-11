package com.augusto.augustoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augusto.augustoVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
