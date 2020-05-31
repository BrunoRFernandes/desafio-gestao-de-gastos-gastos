package br.com.gft.gastos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.gastos.model.Gasto;

public interface GastoRepository extends JpaRepository<Gasto, Long>{
	List<Gasto> findByCliente(Long id);
}
