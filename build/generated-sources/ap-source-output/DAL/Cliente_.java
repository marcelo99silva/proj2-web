package DAL;

import DAL.ClienteAula;
import DAL.Marcacao;
import DAL.Pagamento;
import DAL.Plano;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-20T20:00:17")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Plano> idplano;
    public static volatile ListAttribute<Cliente, Marcacao> marcacaoList;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, BigDecimal> idcliente;
    public static volatile SingularAttribute<Cliente, BigInteger> ncc;
    public static volatile ListAttribute<Cliente, Pagamento> pagamentoList;
    public static volatile SingularAttribute<Cliente, String> password;
    public static volatile SingularAttribute<Cliente, BigInteger> telemovel;
    public static volatile ListAttribute<Cliente, ClienteAula> clienteAulaList;
    public static volatile SingularAttribute<Cliente, String> dataNascimento;
    public static volatile SingularAttribute<Cliente, String> sexo;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> rua;
    public static volatile SingularAttribute<Cliente, String> username;

}