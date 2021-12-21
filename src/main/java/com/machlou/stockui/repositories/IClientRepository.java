package com.machlou.stockui.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.machlou.stockui.entities.Client;

@Repository
public interface IClientRepository extends CrudRepository<Client, Long>{
	
	List<Client> findByNomContains(String nomOrPrenom);
	
}
