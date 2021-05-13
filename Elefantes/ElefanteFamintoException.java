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
public class ElefanteFamintoException extends Exception{
    
    private double valor;
    
    public ElefanteFamintoException(String mensagem, double valor){
        
        super(mensagem);
        
        this.valor = valor;
    }

    ElefanteFamintoException(double valor) {
        
        this.valor = valor;
    }
    
    public double getValor(){
        
        return valor;
    }
}
