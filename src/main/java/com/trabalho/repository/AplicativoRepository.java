package com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.entity.Aplicativo;

@Repository
public interface AplicativoRepository extends JpaRepository<Aplicativo, Integer> {

}
