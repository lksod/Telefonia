package ifsuldeminas.telefonia.model.entity.telefonia.comercial;

import ifsuldeminas.telefonia.model.entity.telefonia.pessoal.Cliente;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private long numero;
    private Cliente cliente;
    private Plano plano;
    private Set<Ligacao> ligacoes;
}

