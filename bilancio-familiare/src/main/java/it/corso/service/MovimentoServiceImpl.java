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
    
    @Override
    public List<Movimento> getAllMovimenti() {
        return (List<Movimento>) movimentoRepository.findAll();
    }
    
    @Override
    public void salvaMovimento(Movimento movimento) {
        movimentoRepository.save(movimento);
    }
    
    
    @Override
    public void eliminaMovimento(int id) {
        movimentoRepository.deleteById(id);
    }


    @Override
    public Movimento getMovimentoById(Integer id) {
        Optional<Movimento> movimentoOptional = movimentoRepository.findById(id);
        if(movimentoOptional.isPresent()){
            return movimentoOptional.get();
        }
        return null;
    }
}
