import java.util.List;

public class DESPESA {
    private int ano;
    private int mes;
    private double valor;
    private int despesageral;
    private String descricao;
    private APARTAMENTO numero; 
    private String vencimento;
    private String pagamento;
    
    DESPESA(){
        this(0,0,0,0,"",  "","" );
    }
    
    DESPESA( int anos, int mess, double valorr, int geral, String desc,  String venci, String pagto ){
    
        ano = anos;
        mes =mess;
        valor = valorr;
        despesageral = geral;
        descricao = desc;
        vencimento = venci;
        pagamento = pagto;
               
}
}
