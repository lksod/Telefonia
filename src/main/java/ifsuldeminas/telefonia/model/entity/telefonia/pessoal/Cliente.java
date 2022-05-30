package ifsuldeminas.telefonia.model.entity.telefonia.pessoal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;
    private String endereco;

}
