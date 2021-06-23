package DAL;

import DAL.Marcacao;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, Marcacao> idmarcacao;
    public static volatile SingularAttribute<Avaliacao, Double> dobraCutaneaCoxa;
    public static volatile SingularAttribute<Avaliacao, Double> perimetroPerna;
    public static volatile SingularAttribute<Avaliacao, Double> peso;
    public static volatile SingularAttribute<Avaliacao, Double> altura;
    public static volatile SingularAttribute<Avaliacao, Double> dobraCutaneaTriceps;
    public static volatile SingularAttribute<Avaliacao, Double> perimetroBraco;
    public static volatile SingularAttribute<Avaliacao, Double> dobraCutaneaBiceps;
    public static volatile SingularAttribute<Avaliacao, String> sexo;
    public static volatile SingularAttribute<Avaliacao, Double> perimetroCintura;
    public static volatile SingularAttribute<Avaliacao, BigDecimal> idavaliacao;
    public static volatile SingularAttribute<Avaliacao, Double> dobraCutaneaAbdomen;

}