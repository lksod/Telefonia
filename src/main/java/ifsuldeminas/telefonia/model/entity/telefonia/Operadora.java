package ifsuldeminas.telefonia.model.entity.telefonia;

import ifsuldeminas.telefonia.model.entity.telefonia.comercial.Celular;
import ifsuldeminas.telefonia.model.entity.telefonia.comercial.Plano;
import ifsuldeminas.telefonia.model.entity.telefonia.pessoal.Cliente;
import org.springframework.boot.SpringApplication;

import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;
    private Set<Cliente> clientes;
    private Set<Celular> celulares;
    private Set<Plano> planos;

    public static void main(String[] args) {
        SpringApplication.run(Operadora.class, args);
    }

}
