package it.corso.service;

import java.util.List;

import it.corso.model.Movimento;

public interface MovimentoService {

    List<Movimento> getAllMovimenti();
    void salvaMovimento(Movimento movimento);
    Movimento getMovimentoById(Integer id);
    void eliminaMovimento(int id);
}
