package com.augusto.augustoVendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augusto.augustoVendas.dto.SellerDTO;
import com.augusto.augustoVendas.entities.Seller;
import com.augusto.augustoVendas.repositories.SellerRepository;

//este serviço chama o camada de interação com bs e retorna todo o bd de seller
@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		//converte lista original result pra outra lista de outro tipo, no caso lista do tipo DTO
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
