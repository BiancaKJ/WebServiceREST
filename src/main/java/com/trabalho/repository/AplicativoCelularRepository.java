package com.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trabalho.entity.Aplicativo;
import com.trabalho.entity.AplicativoCelular;

@Repository
@Transactional
public interface AplicativoCelularRepository extends JpaRepository<AplicativoCelular, Integer>, JpaSpecificationExecutor<AplicativoCelular>{
	
	@Query("SELECT appCel.aplicativo FROM AplicativoCelular appCel "
			+ "LEFT JOIN Aplicativo app ON app.id = appCel.aplicativo.id "
			+ "WHERE appCel.celular.id = :idCel")
	List<Aplicativo> listAllAppsByIdCel(@Param("idCel") Integer idCel);

}
