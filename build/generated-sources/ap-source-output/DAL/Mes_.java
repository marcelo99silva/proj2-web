package DAL;

import DAL.Pagamento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Mes.class)
public class Mes_ { 

    public static volatile ListAttribute<Mes, Pagamento> pagamentoList;
    public static volatile SingularAttribute<Mes, BigDecimal> idmes;
    public static volatile SingularAttribute<Mes, String> nome;

}