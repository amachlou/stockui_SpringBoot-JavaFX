package com.machlou.stockui.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.machlou.stockui.entities.Commande;
import com.machlou.stockui.entities.Vente;

@Repository
public interface ICommandeRepository extends JpaRepository<Vente, Long>{

	@Query("from Commande c where c.vente.id = :id")
	List<Commande> findByVenteId(@Param("id") long id);

}
