package ifsuldeminas.telefonia.model.entity.telefonia.comercial;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Ligacao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private int duracao;
}
