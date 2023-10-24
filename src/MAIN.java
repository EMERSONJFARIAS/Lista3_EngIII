import java.util.Date;

public class MAIN {
    private static final int TAMANHO_MAXIMO_DESPESAS = 100;
    private DESPESA[] despesas = new DESPESA[TAMANHO_MAXIMO_DESPESAS];
    private int contadorDespesas = 0;

    public static void main(String[] args) {
        MAIN main = new MAIN();
        main.lancarDespesa(2023, 10, 500.0, true, "Manutenção do Condomínio", 101, new String());
        main.lancarDespesa(2023, 10, 300.0, false, "Limpeza da Área Comum", 102, new String());
        main.gerarBoleto();
    }

    public void lancarDespesa(int ano, int mes, double valor, boolean tipoGeral, String descricao, int numero, String vencimento) {
        if (contadorDespesas < TAMANHO_MAXIMO_DESPESAS) {
            DESPESA despesa = new DESPESA();
            despesa.setAno(ano);
            despesa.setMes(mes);
            despesa.setValor(valor);
            despesa.setTipoGeral(tipoGeral);
            despesa.setDescricao(descricao);
            despesa.setVencimento(vencimento);
            
            APARTAMENTO apartamento = new APARTAMENTO();
            apartamento.setNumero(numero);

            despesas[contadorDespesas] = despesa;
            contadorDespesas++;

            System.out.println("Despesa lançada: " + descricao);
        } else {
            System.out.println("Limite máximo de despesas atingido. Não é possível adicionar mais despesas.");
        }
    }

    public void gerarBoleto() {
        double valorTotal = 0;
        for (int i = 0; i < contadorDespesas; i++) {
            valorTotal += despesas[i].getValor();
        }

        System.out.println("----- Boleto -----");
        System.out.println("Data de Vencimento: " + new Date()); // Data atual como exemplo, você pode ajustar conforme necessário
        System.out.println("Valor total a ser pago: R$" + valorTotal);
        System.out.println("-------------------");
    }
}
