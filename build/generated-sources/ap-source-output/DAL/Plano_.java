package DAL;

import DAL.Cliente;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Plano.class)
public class Plano_ { 

    public static volatile SingularAttribute<Plano, Double> preco;
    public static volatile ListAttribute<Plano, Cliente> clienteList;
    public static volatile SingularAttribute<Plano, BigDecimal> idplano;
    public static volatile SingularAttribute<Plano, String> nome;

}