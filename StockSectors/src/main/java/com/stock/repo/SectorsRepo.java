package com.stock.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.stock.entity.Sectors;

public interface SectorsRepo extends JpaRepository<Sectors, Integer>{
	
//	//Custom Query Type:1
//	List<StockEntity> findByNameAndMarketName(String name, String marketName);
//	
//	//Custom Query Type:2
//	@Query("SELECT * FROM StockEntity as se where name=:1 AND marketName=:2") //JPQL
//	List<StockEntity> findByNameAndMarketNameIgnoreCase(String name, String marketName);
}
