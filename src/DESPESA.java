import java.util.List;
import java.util.Date;

public class DESPESA {
    private int ano;
    private int mes;
    private double valor;
    private boolean tipoGeral;
    private String descricao;
    private APARTAMENTO numero; 
    private String vencimento;
    private String pagamento;
    
    DESPESA(){
        this(0,0,0,false,"", "","" );
    }
    
    DESPESA( int anos, int mess, double valorr, boolean geral, String desc,  String venci, String pagto ){
    
        ano = anos;
        mes =mess;
        valor = valorr;
        tipoGeral = geral;
        descricao = desc;
        vencimento = venci;
        pagamento = pagto;
               
}

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isTipoGeral() {
        return tipoGeral;
    }

    public void setTipoGeral(boolean tipoGeral) {
        this.tipoGeral = tipoGeral;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public APARTAMENTO getNumero() {
        return numero;
    }

    public void setNumero(APARTAMENTO numero) {
        this.numero = numero;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

   
}
