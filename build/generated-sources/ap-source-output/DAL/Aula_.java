package DAL;

import DAL.ClienteAula;
import DAL.Funcionario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Aula.class)
public class Aula_ { 

    public static volatile SingularAttribute<Aula, String> horariofinal;
    public static volatile SingularAttribute<Aula, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Aula, String> diasemana;
    public static volatile ListAttribute<Aula, ClienteAula> clienteAulaList;
    public static volatile SingularAttribute<Aula, String> nome;
    public static volatile SingularAttribute<Aula, String> horarioinicial;
    public static volatile SingularAttribute<Aula, BigDecimal> idaula;

}