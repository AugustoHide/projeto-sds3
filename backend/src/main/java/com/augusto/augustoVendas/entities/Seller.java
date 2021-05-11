package com.augusto.augustoVendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // INDICA QUE BD VAI SER AUTO INCREMENTÁVEL AUTOMATICAMENTE
	private long id;
	private String name;
	
	@OneToMany(mappedBy = "seller") // ligado ao atributo seller na classe Sale
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
		
	}

	public Seller(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

	
}