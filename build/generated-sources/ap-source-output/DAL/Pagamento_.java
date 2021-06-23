package DAL;

import DAL.Cliente;
import DAL.Mes;
import DAL.Tipopagamento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Double> preco;
    public static volatile SingularAttribute<Pagamento, Mes> mes;
    public static volatile SingularAttribute<Pagamento, BigDecimal> idpagamento;
    public static volatile SingularAttribute<Pagamento, Cliente> idcliente;
    public static volatile SingularAttribute<Pagamento, Tipopagamento> tipopagamento;

}