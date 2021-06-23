package DAL;

import DAL.Dia;
import DAL.Funcionario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Horario, Dia> iddia;
    public static volatile SingularAttribute<Horario, String> horaentrda;
    public static volatile SingularAttribute<Horario, BigDecimal> idhorario;
    public static volatile SingularAttribute<Horario, String> horasaida;

}