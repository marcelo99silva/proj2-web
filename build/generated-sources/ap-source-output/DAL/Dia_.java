package DAL;

import DAL.Horario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Dia.class)
public class Dia_ { 

    public static volatile SingularAttribute<Dia, BigDecimal> iddia;
    public static volatile SingularAttribute<Dia, String> nome;
    public static volatile ListAttribute<Dia, Horario> horarioList;

}