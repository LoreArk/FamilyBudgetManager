package it.corso.service;

import it.corso.model.Movimento;
import it.corso.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentoServiceImpl implements MovimentoService {

    @Autowired
    private MovimentoRepository movimentoRepository;
   
        
    public List<Movimento> getAllMovimenti() {
        return (List<Movimento>) movimentoRepository.findAll();
    }
   
      
    public void salvaMovimento(Movimento movimento) {
        movimentoRepository.save(movimento);
    }

       
    public Optional<Movimento> getMovimentoById(int id) {
        return movimentoRepository.findById(id);
    }

         
    public void eliminaMovimento(int id) {
        movimentoRepository.deleteById(id);
    }
}
