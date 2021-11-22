package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trabalho.entity.Celular;

@Repository
@Transactional
public interface CelularRepository extends JpaRepository<Celular, Integer>, JpaSpecificationExecutor<Celular> {

}
