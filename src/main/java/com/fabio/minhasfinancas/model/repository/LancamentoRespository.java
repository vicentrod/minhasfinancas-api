package com.fabio.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRespository extends JpaRepository<Lancamento, Long>{

}
