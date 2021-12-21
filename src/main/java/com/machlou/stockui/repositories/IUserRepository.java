package com.machlou.stockui.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.machlou.stockui.entities.User;

@Repository
//@Configuration
//@EnableJpaRepositories(basePackages = "ma.dwm.magasin.repositories")
//@EntityScan(basePackages = "ma.dwm.magasin.repositories")
//@Transactional
public interface IUserRepository extends JpaRepository<User, Long>{
	
//	@Query("from user u where u.username=:username and u.password=:password")
//	@Query("select u from user u ")
	List<User> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
	
}
