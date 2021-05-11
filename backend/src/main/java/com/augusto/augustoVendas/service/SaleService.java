package com.augusto.augustoVendas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.augusto.augustoVendas.dto.SaleDTO;
import com.augusto.augustoVendas.dto.SaleSuccessDTO;
import com.augusto.augustoVendas.dto.SaleSumDTO;
import com.augusto.augustoVendas.entities.Sale;
import com.augusto.augustoVendas.repositories.SaleRepository;
import com.augusto.augustoVendas.repositories.SellerRepository;

//este serviço chama o camada de interação com bs e retorna todo o bd de seller
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		//converte lista original result pra outra lista de outro tipo, no caso lista do tipo DTO
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
}
