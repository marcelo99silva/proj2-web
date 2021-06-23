package DAL;

import DAL.Avaliacao;
import DAL.Cliente;
import DAL.Funcionario;
import DAL.Tipomarcacao;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Marcacao.class)
public class Marcacao_ { 

    public static volatile SingularAttribute<Marcacao, BigDecimal> idmarcacao;
    public static volatile SingularAttribute<Marcacao, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Marcacao, String> data;
    public static volatile SingularAttribute<Marcacao, String> horario;
    public static volatile SingularAttribute<Marcacao, Tipomarcacao> realizado;
    public static volatile ListAttribute<Marcacao, Avaliacao> avaliacaoList;
    public static volatile SingularAttribute<Marcacao, Cliente> idcliente;

}