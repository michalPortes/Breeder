package Elefantes;


public class ElefanteSatisfeiroException extends Exception{
    
    private double valor;
    
    
    public ElefanteSatisfeiroException (String mensagem, double valor){
        
        super(mensagem);
        
        this.valor = valor;
    }
    
       ElefanteSatisfeiroException(double valor) {
           this.valor = valor;
    }
    
    public double getValor(){
        
        return valor;
    }
}
