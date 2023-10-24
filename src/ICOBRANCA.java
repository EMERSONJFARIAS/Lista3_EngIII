import javax.swing.*;
public class ICOBRANCA {
    


public interface Lancavel {
    void lancaDespesa(int ano, int mes, double valor, boolean tipoGeral, String descricao, int numeroApartamento, String vencimento);
}

   
public class APARTAMENTO implements Lancavel {
    private int numero;
    private int quantidadeQuartos;
    private String tipoOcupacao;
    private PROPRIETARIO proprietario;

    // Construtores, getters e setters para os atributos da classe Apartamento

    @Override
    public void lancaDespesa(int ano, int mes, double valor, boolean tipoGeral, String descricao, int numero, String vencimento) {}}}

