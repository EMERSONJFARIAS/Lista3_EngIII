import java.util.List;

public class APARTAMENTO {
    private int numero;
    private int qtdequartos;
    private String tipoOcupacao;
    private PROPRIETARIO nome;


APARTAMENTO() {
this (0,0,"");

}

APARTAMENTO( int num, int quartos, String tipoOcup){
    
    numero = num;
    qtdequartos = quartos;
    tipoOcupacao = tipoOcup;
    
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdequartos() {
        return qtdequartos;
    }

    public void setQtdequartos(int qtdequartos) {
        this.qtdequartos = qtdequartos;
    }

    public String getTipoOcupacao() {
        return tipoOcupacao;
    }

    public void setTipoOcupacao(String tipoOcupacao) {
        this.tipoOcupacao = tipoOcupacao;
    }

    public PROPRIETARIO getNome() {
        return nome;
    }

    public void setNome(PROPRIETARIO nome) {
        this.nome = nome;
    }
 




}
