package it.corso.service;

import java.util.List;
import java.util.Optional;

import it.corso.model.Movimento;

public interface MovimentoService {

    List<Movimento> getAllMovimenti();
    void salvaMovimento(Movimento movimento);
    Optional<Movimento> getMovimentoById(int id);
    void eliminaMovimento(int id);
}
