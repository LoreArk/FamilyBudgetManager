package it.corso.repository;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Movimento;

public interface MovimentoRepository extends CrudRepository<Movimento, Integer>{

    
}
