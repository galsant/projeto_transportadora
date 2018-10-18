package br.com.gustavo.transportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.transportes.entity.Registro;
import br.com.gustavo.transportes.repository.Repository;

/**
 * Classe controle que representa nosso webservice onde o app
 * web irá buscar as informações sobre o rastreio dos objetos
 * 
 * @author Gusta
 *
 */
@RestController
public class EntregaController {

	@Autowired
	Repository entregaRepo;
	
	@RequestMapping("/rastrear/{id}")
	public List<Registro> rastrear(@PathVariable("id") long id) {
		List<Registro> retorno = entregaRepo.find((long)id);
		return retorno;
	}
	
}
