package ifsuldeminas.telefonia.model.entity.telefonia.comercial;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CelularPrePago extends Celular {
    private double saldo;
    @Temporal(TemporalType.DATE)
    private Date dataDeValidade;
}
