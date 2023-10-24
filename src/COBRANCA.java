import java.util.List;

public class COBRANCA {
    private int ano;
    private int mes;
    private double valor;
    private String dataDeVencimento;
    private String dataDePagamento;
    private double juros;
    private double multa;
    private double valorTotal;
   
    COBRANCA (){
        this (0,0,0,"","",0,0,0);    }
         
    COBRANCA ( int anoo, int mess, int valorr, String venci, String pgtos, double juro,
            double multas, double tot){
        
        ano = anoo;
        mes = mess;
        valor = valorr;
        dataDeVencimento = venci;
        dataDePagamento = pgtos;
        juros = juro;
        multa = multas;
        valorTotal = tot;
        
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

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    

}
