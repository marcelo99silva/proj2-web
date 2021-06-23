package DAL;

import DAL.Aula;
import DAL.Horario;
import DAL.Marcacao;
import DAL.Tipofuncionario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, BigDecimal> idfuncionario;
    public static volatile ListAttribute<Funcionario, Marcacao> marcacaoList;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, BigInteger> nif;
    public static volatile SingularAttribute<Funcionario, BigInteger> ncc;
    public static volatile SingularAttribute<Funcionario, String> password;
    public static volatile SingularAttribute<Funcionario, BigInteger> telemovel;
    public static volatile ListAttribute<Funcionario, Aula> aulaList;
    public static volatile SingularAttribute<Funcionario, Tipofuncionario> tipofuncionario;
    public static volatile SingularAttribute<Funcionario, String> dataNascimento;
    public static volatile SingularAttribute<Funcionario, String> email;
    public static volatile SingularAttribute<Funcionario, String> rua;
    public static volatile ListAttribute<Funcionario, Horario> horarioList;

}