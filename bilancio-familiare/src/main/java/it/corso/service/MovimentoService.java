package it.corso.service;

import it.corso.model.Movimento;
import it.corso.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository movimentoRepository;

    /**
     * Restituisce tutti i movimenti presenti nel database.
     */
    public List<Movimento> getAllMovimenti() {
        return movimentoRepository.findAll();
    }

    /**
     * Salva un nuovo movimento nel database.
     */
    public void salvaMovimento(Movimento movimento) {
        movimentoRepository.save(movimento);
    }

    /**
     * Ritorna un movimento a partire dal suo ID, se esiste.
     */
    public Optional<Movimento> getMovimentoById(int id) {
        return movimentoRepository.findById(id);
    }

    /**
     * Elimina un movimento in base all'ID.
     */
    public void eliminaMovimento(int id) {
        movimentoRepository.deleteById(id);
    }
}
