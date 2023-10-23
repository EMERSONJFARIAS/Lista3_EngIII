import java.util.List;

public class COBRANCA {
    private int ano;
    private int mes;
    private int valor;
    private String datavenc;
    private String datapgto;
    private double juros;
    private double multa;
    private double valortotal;
   
    COBRANCA (){
        this (0,0,0,"","",0,0,0);    }
         
    COBRANCA ( int anoo, int mess, int valorr, String venci, String pgtos, double juro,
            double multas, double tot){
        
        ano = anoo;
        mes = mess;
        valor = valorr;
        datavenc = venci;
        datapgto = pgtos;
        juros = juro;
        multa = multas;
        valortotal = tot;
        
    }

}
