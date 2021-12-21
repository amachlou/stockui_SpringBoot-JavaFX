package com.machlou.stockui.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.machlou.stockui.entities.Produit;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long>{
	
	List<Produit> findByDesignationContains(String designation);

}
