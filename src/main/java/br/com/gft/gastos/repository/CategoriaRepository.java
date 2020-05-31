package br.com.gft.gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.gastos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	Categoria findByCategoria(String categoria);
}
