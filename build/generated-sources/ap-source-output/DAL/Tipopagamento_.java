package DAL;

import DAL.Pagamento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Tipopagamento.class)
public class Tipopagamento_ { 

    public static volatile ListAttribute<Tipopagamento, Pagamento> pagamentoList;
    public static volatile SingularAttribute<Tipopagamento, String> nome;
    public static volatile SingularAttribute<Tipopagamento, BigDecimal> idpagamento;

}