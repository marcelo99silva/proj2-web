package DAL;

import DAL.Marcacao;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Tipomarcacao.class)
public class Tipomarcacao_ { 

    public static volatile ListAttribute<Tipomarcacao, Marcacao> marcacaoList;
    public static volatile SingularAttribute<Tipomarcacao, String> nome;
    public static volatile SingularAttribute<Tipomarcacao, BigDecimal> idtipo;

}