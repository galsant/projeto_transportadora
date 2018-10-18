package br.com.gustavo.transportes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.gustavo.transportes.entity.Registro;

/**
 * Interface utilizada para acessas operações disponíveis no JpaRepository implementação
 * ou reescrever e implementar operações customizadas.
 * 
 * @author Gusta
 *
 */
public interface Repository extends JpaRepository<Registro, Long> {
	
	@Query(value="select * FROM Registro where objeto_id = :id", nativeQuery=true)
    public List<Registro> find(@Param("id") Long id);
	
}

