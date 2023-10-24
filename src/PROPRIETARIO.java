
public class PROPRIETARIO {
    private String nome;
    private String telefone;

 PROPRIETARIO (){
this ("","");
}

PROPRIETARIO( String nomes, String telefones){
    nome = nomes;
    telefone = telefones;
    
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}