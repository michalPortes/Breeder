/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elefantes;

/**
 *
 * @author micha
 */
public class ExefanteDesidratadoException extends Exception{
    
    private double valor;
    
    public ExefanteDesidratadoException(String mensagem, double valor){
    
        super(mensagem);
        
        this.valor = valor;
    
    }
    
    ExefanteDesidratadoException(double valor) {
        this.valor = valor;
    }
    
    public double getValor(){
        
        return valor;
    }
}
