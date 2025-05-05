package it.corso.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bilancio")
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descrizione;

    private LocalDateTime ricezione;

    @Column(name = "importo_entrata")
    private Integer importoEntrata;

    @Column(name = "importo_uscita")
    private Integer importoUscita;

    // Costruttore vuoto
    public Movimento() {}

    // Costruttore completo
    public Movimento(String descrizione, LocalDateTime ricezione, Integer importoEntrata, Integer importoUscita) {
        this.descrizione = descrizione;
        this.ricezione = ricezione;
        this.importoEntrata = importoEntrata;
        this.importoUscita = importoUscita;
    }

    // Getter e Setter
    public int getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDateTime getRicezione() {
        return ricezione;
    }

    public void setRicezione(LocalDateTime ricezione) {
        this.ricezione = ricezione;
    }

    public Integer getImportoEntrata() {
        return importoEntrata;
    }

    public void setImportoEntrata(Integer importoEntrata) {
        this.importoEntrata = importoEntrata;
    }

    public Integer getImportoUscita() {
        return importoUscita;
    }

    public void setImportoUscita(Integer importoUscita) {
        this.importoUscita = importoUscita;
    }
}
