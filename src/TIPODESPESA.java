
public class TIPODESPESA {
    private String FIXA;
    private String VARIAVEL;
   
    

TIPODESPESA(){
this("","");
}


TIPODESPESA(String fix, String var){

    FIXA = fix;
    VARIAVEL = var;
}

    public String getFIXA() {
        return FIXA;
    }

    public void setFIXA(String FIXA) {
        this.FIXA = FIXA;
    }

    public String getVARIAVEL() {
        return VARIAVEL;
    }

    public void setVARIAVEL(String VARIAVEL) {
        this.VARIAVEL = VARIAVEL;
    }

    

}