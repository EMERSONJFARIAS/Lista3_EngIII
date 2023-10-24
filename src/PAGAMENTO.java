
public class PAGAMENTO {
    private double valor;
    private String date;


PAGAMENTO(){
this(0,"");
}

PAGAMENTO(int valorr, String data){
 valor = valorr;
 date = data;

}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

//https://online.visual-paradigm.com/w/anfnplte/diagrams/#diagram:proj=0&type=ClassDiagram&width=11&height=8.5&unit=inch